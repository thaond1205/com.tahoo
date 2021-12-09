package vn.onehs.proprerty.infastructure.sourcesql;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

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
