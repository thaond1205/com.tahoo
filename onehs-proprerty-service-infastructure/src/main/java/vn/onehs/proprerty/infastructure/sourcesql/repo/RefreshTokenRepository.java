package vn.onehs.proprerty.infastructure.sourcesql.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import vn.onehs.proprerty.infastructure.sourcesql.RefreshToken;
import vn.onehs.proprerty.infastructure.sourcesql.UserSql;

import java.util.Optional;


@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByToken(String token);

  @Modifying
  int deleteByUser(UserSql user);
}
