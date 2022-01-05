package vn.onehs.proprerty.infastructure.sourcesql;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

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
