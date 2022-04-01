package com.tahoo.infastructure.sourcesql;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.tahoo.infastructure.base.BaseModel;

import javax.persistence.*;

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
