package vn.onehs.propertybusiness.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Galleries {

    private String id;
    private String mediaType;
    private String url;

    private Properties property;
}
