package vn.onehs.property.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import vn.onehs.propertybusiness.domain.Properties;

import java.util.List;

@Data
@AllArgsConstructor
public class ProjectDto {

    private String id;
    private String projectName;
    private String address;
    private String description;

    List<PropertiesDto> property;
}
