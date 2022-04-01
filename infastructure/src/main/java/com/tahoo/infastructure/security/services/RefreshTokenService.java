package com.tahoo.infastructure.security.services;

import com.tahoo.infastructure.sourcesql.RefreshToken;
import com.tahoo.infastructure.sourcesql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tahoo.common.exception.TokenRefreshException;
import com.tahoo.infastructure.sourcesql.repo.RefreshTokenRepository;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;


@Service
public class RefreshTokenService {
  private Long refreshTokenDurationMs = 86400000L;

  @Autowired
  private RefreshTokenRepository refreshTokenRepository;

  @Autowired
  private UserRepository userRepository;

  public Optional<RefreshToken> findByToken(String token) {
    return refreshTokenRepository.findByToken(token);
  }

  public RefreshToken createRefreshToken(Integer userId) {
    RefreshToken refreshToken = new RefreshToken();

    refreshToken.setUser(userRepository.findById(userId).get());
    refreshToken.setExpiryDate(Instant.now().plusMillis(refreshTokenDurationMs));
    refreshToken.setToken(UUID.randomUUID().toString());

    refreshToken = refreshTokenRepository.save(refreshToken);
    return refreshToken;
  }

  public RefreshToken verifyExpiration(RefreshToken token) {
    if (token.getExpiryDate().compareTo(Instant.now()) < 0) {
      refreshTokenRepository.delete(token);
      throw new TokenRefreshException(token.getToken(), "Refresh token was expired. Please make a new signin request");
    }

    return token;
  }

  @Transactional
  public int deleteByUserId(Integer userId) {
    return refreshTokenRepository.deleteByUser(userRepository.findById(userId).get());
  }
}
