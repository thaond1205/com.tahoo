package com.tahoo.infastructure.sourcesql;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.tahoo.infastructure.base.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;

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
