package com.tahoo.infastructure.sourcesql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.tahoo.infastructure.base.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "LEGAL_INFOS")
public class LegalInfosSql extends BaseModel {

    @Id
    private String id;
    private String status;

    @OneToOne
    private PropertiesSql property;

}
