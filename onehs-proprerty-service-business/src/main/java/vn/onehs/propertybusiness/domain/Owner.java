package vn.onehs.propertybusiness.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Owner {

    private String id;
    private String fullname;
    private String phoneNumber;
    private String address;
    private String gender;

    private List<Properties> property;
}
