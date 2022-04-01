package com.tahoo.infastructure.sourcesql;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.tahoo.infastructure.base.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "PROJECTS")
public class ProjectsSql extends BaseModel {

    @Id
    private String id;
    private String projectName;
    private String address;
    private String description;

    @OneToMany(mappedBy = "projects")
    List<PropertiesSql> property;
}
