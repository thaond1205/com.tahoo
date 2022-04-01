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
@Table(name = "GALLERIES")
public class GalleriesSql extends BaseModel {

    @Id
    private String id;
    private String mediaType;
    private String url;

    @ManyToOne
    private PropertiesSql property;
}
