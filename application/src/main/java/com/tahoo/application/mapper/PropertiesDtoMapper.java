package com.tahoo.application.mapper;

import org.mapstruct.Mapper;
import com.tahoo.application.dto.PropertiesDto;
import com.tahoo.business.domain.Properties;
import com.tahoo.common.exception.shared.mapper.IObjectMapper;

@Mapper(componentModel = "spring")
public interface PropertiesDtoMapper extends IObjectMapper<PropertiesDto, Properties> {
}
