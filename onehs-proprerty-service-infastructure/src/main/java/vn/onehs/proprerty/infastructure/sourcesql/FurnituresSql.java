package vn.onehs.proprerty.infastructure.sourcesql;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "FURTURE_INFOS")
public class FurnituresSql extends BaseModel {

    @Id
    private String id;
    private String nameFurniture;
    private Integer number;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "propertiesId")
    private PropertiesSql property;
}
