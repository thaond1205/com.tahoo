package vn.onehs.property.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import vn.onehs.propertybusiness.domain.Properties;

import java.util.List;

@Data
@AllArgsConstructor
public class AddressDto {

    private Long id;
    private String city;
    private String district;
    private String ward;

    private List<PropertiesDto> property;
}
