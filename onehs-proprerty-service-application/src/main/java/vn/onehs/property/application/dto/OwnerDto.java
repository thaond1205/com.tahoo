package vn.onehs.property.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import vn.onehs.propertybusiness.domain.Properties;

import java.util.List;

@Data
@AllArgsConstructor
public class OwnerDto {

    private String id;
    private String fullname;
    private String phoneNumber;
    private String address;
    private String gender;

    private List<PropertiesDto> property;

}
