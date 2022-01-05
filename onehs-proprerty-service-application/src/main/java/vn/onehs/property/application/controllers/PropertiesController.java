package vn.onehs.property.application.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.onehs.property.application.dto.PropertiesDto;
import vn.onehs.propertybusiness.usecase.PropertiesUsecase;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/")
public class PropertiesController {

    @Autowired
    private PropertiesUsecase usecase;

    @GetMapping
    public List<PropertiesDto> getAll(){
        return null;
    }
}
