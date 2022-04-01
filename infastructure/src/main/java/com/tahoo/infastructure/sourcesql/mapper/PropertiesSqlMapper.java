package com.tahoo.infastructure.sourcesql.mapper;

import com.tahoo.infastructure.sourcesql.PropertiesSql;
import org.mapstruct.Mapper;
import com.tahoo.business.domain.Properties;
import com.tahoo.common.exception.shared.mapper.IObjectMapper;

@Mapper(componentModel = "spring")
public interface PropertiesSqlMapper extends IObjectMapper<Properties, PropertiesSql> {

}
