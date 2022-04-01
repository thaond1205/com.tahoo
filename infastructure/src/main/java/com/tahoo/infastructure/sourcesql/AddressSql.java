package com.tahoo.infastructure.sourcesql;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ADDRESS")
public class AddressSql {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String ward;

    @OneToMany(mappedBy = "address")
    private List<PropertiesSql> property;
}
