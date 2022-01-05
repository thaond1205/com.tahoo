package vn.onehs.propertybusiness.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Properties {

    private String id;
    private String balconyView;
    private BigDecimal numberOfBedrooms;
    private BigDecimal numberOfBathrooms;
    private String propertyDescription;
    private String apartmentStatus;
    private Integer livingArea;
    private Integer numberBalconyBedroom;
    private BigDecimal numberBalcony;
    private String balconyDirection;
    private String propertyCategory;
    private String numberFloor;
    private Double height;
    private Double width;
    private Double Long;

    private Project projects;

    private List<Galleries> galleries;

    private Owner ownner;

    private Address address;
}
