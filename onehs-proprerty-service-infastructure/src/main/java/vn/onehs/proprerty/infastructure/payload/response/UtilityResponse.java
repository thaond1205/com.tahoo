package vn.onehs.proprerty.infastructure.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UtilityResponse {
    private Long id;

    private String utilityName;

    private String image;

    private List<DetaiUtilityResponse> detailUtilities;

    private TypeUtilityResponse typeUtility;

}
