package vn.onehs.property.application.mapper;

import org.mapstruct.Mapper;
import vn.onehs.property.application.dto.PropertiesDto;
import vn.onehs.propertybusiness.domain.Properties;
import vn.onehs.proprerty.common.exception.shared.mapper.IObjectMapper;

@Mapper(componentModel = "spring")
public interface PropertiesDtoMapper extends IObjectMapper<PropertiesDto, Properties> {
}
