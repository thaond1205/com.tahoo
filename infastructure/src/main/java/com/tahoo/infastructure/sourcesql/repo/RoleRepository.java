package com.tahoo.infastructure.sourcesql.repo;

import java.util.Optional;

import com.tahoo.infastructure.sourcesql.ERole;
import com.tahoo.infastructure.sourcesql.RoleSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleSql, Long> {
  Optional<RoleSql> findByName(ERole name);
}
