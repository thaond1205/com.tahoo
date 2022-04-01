package com.tahoo.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class GalleriesDto {

    private String id;
    private String mediaType;
    private String url;

    private PropertiesDto property;
}
