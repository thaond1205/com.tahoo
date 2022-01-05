package vn.onehs.proprerty.infastructure.sourcesql.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.onehs.proprerty.infastructure.sourcesql.UserSql;

@Repository
public interface UserRepository extends JpaRepository<UserSql, Integer> {
	Optional<UserSql> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	@Query(value = "SELECT * FROM `users` join user_roles on user_roles.user_id = users.id join roles on roles.id = user_roles.role_id \r\n"
			+ "where roles.name = ?1", nativeQuery = true)
	List<UserSql> findAll(String roleName);

}
