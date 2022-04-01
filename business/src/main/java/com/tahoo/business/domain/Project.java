package com.tahoo.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Project {

    private String id;
    private String projectName;
    private String address;
    private String description;

    List<Properties> property;
}
