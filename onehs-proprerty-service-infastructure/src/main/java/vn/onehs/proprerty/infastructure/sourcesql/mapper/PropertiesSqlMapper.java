package vn.onehs.proprerty.infastructure.sourcesql.mapper;

import org.mapstruct.Mapper;
import vn.onehs.propertybusiness.domain.Properties;
import vn.onehs.proprerty.infastructure.sourcesql.PropertiesSql;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertiesSqlMapper {

    List<Properties> to(List<PropertiesSql> propertiesSqls);
}
