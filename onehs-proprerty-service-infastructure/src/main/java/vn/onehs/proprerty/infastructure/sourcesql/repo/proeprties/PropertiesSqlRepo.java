package vn.onehs.proprerty.infastructure.sourcesql.repo.proeprties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.onehs.proprerty.infastructure.sourcesql.PropertiesSql;

public interface PropertiesSqlRepo extends JpaRepository<PropertiesSql, String> {
}
