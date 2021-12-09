package vn.onehs.proprerty.infastructure.sourcesql;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import vn.onehs.proprerty.infastructure.base.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "LOAN_INFOS")
public class LoanInfosSql extends BaseModel {

    @Id
    private String id;
    private BigDecimal loanAmount;
    private String status;

    @OneToOne
    private PropertiesSql property;
}
