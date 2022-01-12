package vn.onehs.property.application.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.onehs.property.application.dto.PropertiesDto;
import vn.onehs.property.application.mapper.PropertiesDtoMapper;
import static vn.onehs.property.application.common.Constants.URL_BASE;
import vn.onehs.propertybusiness.usecase.PropertiesUsecase;
import vn.onehs.proprerty.common.exception.BaseResponse;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@Slf4j
@RestController
@RequestMapping(URL_BASE+"/properties")
public class PropertiesController {

    @Autowired
    private PropertiesUsecase usecase;

    @Autowired
    private PropertiesDtoMapper mapper;

    @GetMapping
    public BaseResponse<List<PropertiesDto>> getAll(){
        var properties = usecase.getAll();
        log.info("GetAll properties!");
        return BaseResponse.ofSucceeded(mapper.to(properties));
    }
}
