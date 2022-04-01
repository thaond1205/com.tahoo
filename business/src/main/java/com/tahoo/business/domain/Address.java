package com.tahoo.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Address {

    private Long id;
    private String city;
    private String district;
    private String ward;

    private List<Properties> property;
}
