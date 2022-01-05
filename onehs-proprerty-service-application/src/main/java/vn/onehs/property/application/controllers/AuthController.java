package vn.onehs.property.application.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import vn.onehs.proprerty.common.exception.TokenRefreshException;
import vn.onehs.proprerty.infastructure.payload.request.LogOutRequest;
import vn.onehs.proprerty.infastructure.payload.request.LoginRequest;
import vn.onehs.proprerty.infastructure.payload.request.SignupRequest;
import vn.onehs.proprerty.infastructure.payload.request.TokenRefreshRequest;
import vn.onehs.proprerty.infastructure.payload.response.JwtResponse;
import vn.onehs.proprerty.infastructure.payload.response.MessageResponse;
import vn.onehs.proprerty.infastructure.payload.response.TokenRefreshResponse;
import vn.onehs.proprerty.infastructure.security.jwt.JwtUtils;
import vn.onehs.proprerty.infastructure.security.services.RefreshTokenService;
import vn.onehs.proprerty.infastructure.security.services.UserDetailsImpl;
import vn.onehs.proprerty.infastructure.sourcesql.ERole;
import vn.onehs.proprerty.infastructure.sourcesql.RefreshToken;
import vn.onehs.proprerty.infastructure.sourcesql.RoleSql;
import vn.onehs.proprerty.infastructure.sourcesql.UserSql;
import vn.onehs.proprerty.infastructure.sourcesql.repo.RoleRepository;
import vn.onehs.proprerty.infastructure.sourcesql.repo.UserRepository;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    Logger logger = LoggerFactory.getLogger(AuthController.class);


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    RefreshTokenService refreshTokenService;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest)  {


        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);

            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            if (userDetails.getEnabled() == 0) {
                return ResponseEntity.ok().body(new MessageResponse("Tài khoản của bạn đang bị khóa!"));
            }

            String jwt = jwtUtils.generateJwtToken(userDetails);

            List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
                    .collect(Collectors.toList());

            RefreshToken refreshToken = refreshTokenService.createRefreshToken(userDetails.getId());
            // throw new BadCredentialsException

            return ResponseEntity.ok(new JwtResponse(jwt, refreshToken.getToken(), userDetails.getId(),
                    userDetails.getUsername(), userDetails.getEmail(), roles));
        }catch (Exception e){
           return ResponseEntity.badRequest().body(new MessageResponse("Sai tên tài khoản hoặc mật khẩu"));
        }
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        UserSql user = new UserSql(signUpRequest.getUsername(), signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        Set<RoleSql> roles = new HashSet<>();
        RoleSql userRole = roleRepository.findByName(ERole.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        roles.add(userRole);

        user.setRoles(roles);

        // Kích hoạt tài khoản hoạt động
        user.setEnabled(1);
        logger.info("Insert data: " + userRepository.save(user));


        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }

    @PostMapping("/refreshtoken")
    public ResponseEntity<?> refreshtoken(@Valid @RequestBody TokenRefreshRequest request) {
        String requestRefreshToken = request.getRefreshToken();

        return refreshTokenService.findByToken(requestRefreshToken).map(refreshTokenService::verifyExpiration)
                .map(RefreshToken::getUser).map(user -> {
                    String token = jwtUtils.generateTokenFromUsername(user.getUsername());
                    return ResponseEntity.ok(new TokenRefreshResponse(token, requestRefreshToken));
                })
                .orElseThrow(() -> new TokenRefreshException(requestRefreshToken, "Refresh token is not in database!"));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser(@Valid @RequestBody LogOutRequest logOutRequest) {
        refreshTokenService.deleteByUserId(logOutRequest.getUserId());
        return ResponseEntity.ok(new MessageResponse("Log out successful!"));
    }

}
