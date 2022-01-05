package vn.onehs.proprerty.infastructure.sourcesql;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "PROPERTIES")
public class PropertiesSql extends BaseModel {

    @Id
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

    @ManyToOne
    private ProjectsSql projects;

    @OneToMany(mappedBy = "property")
    private List<GalleriesSql> galleries;


}
