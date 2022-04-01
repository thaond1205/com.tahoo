package com.tahoo.infastructure.sourcesql;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.tahoo.infastructure.base.BaseModel;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "OWNERS")
public class OwnerSql extends BaseModel {

    @Id
    private String id;
    private String fullname;
    private String phoneNumber;
    private String address;
    private String gender;

    @OneToMany(mappedBy = "owner")
    private List<PropertiesSql> property;
}
