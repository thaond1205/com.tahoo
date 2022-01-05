package vn.onehs.property.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import vn.onehs.propertybusiness.domain.Properties;

@Data
@AllArgsConstructor

public class GalleriesDto {

    private String id;
    private String mediaType;
    private String url;

    private PropertiesDto property;
}
