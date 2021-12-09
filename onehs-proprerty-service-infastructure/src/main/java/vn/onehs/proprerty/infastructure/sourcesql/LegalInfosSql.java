package vn.onehs.proprerty.infastructure.sourcesql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;


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
