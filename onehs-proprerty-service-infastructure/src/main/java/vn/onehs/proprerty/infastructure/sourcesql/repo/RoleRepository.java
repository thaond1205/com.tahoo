package vn.onehs.proprerty.infastructure.sourcesql.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.onehs.proprerty.infastructure.sourcesql.ERole;
import vn.onehs.proprerty.infastructure.sourcesql.RoleSql;


@Repository
public interface RoleRepository extends JpaRepository<RoleSql, Long> {
  Optional<RoleSql> findByName(ERole name);
}
