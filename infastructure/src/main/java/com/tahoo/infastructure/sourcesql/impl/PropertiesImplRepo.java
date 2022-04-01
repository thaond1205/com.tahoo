package com.tahoo.infastructure.sourcesql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tahoo.business.domain.Properties;
import com.tahoo.business.repo.PropertiesRepo;
import com.tahoo.infastructure.sourcesql.mapper.PropertiesSqlMapper;
import com.tahoo.infastructure.sourcesql.repo.proeprties.PropertiesSqlRepo;

import java.util.List;

@Component
public class PropertiesImplRepo implements PropertiesRepo {

    @Autowired
    private PropertiesSqlRepo repo;

    @Autowired
    private PropertiesSqlMapper mapper;

    @Override
    public List<Properties> getAll() {
        return mapper.to(repo.findAll());
    }
}
