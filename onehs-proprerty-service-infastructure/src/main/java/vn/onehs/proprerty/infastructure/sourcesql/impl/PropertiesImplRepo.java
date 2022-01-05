package vn.onehs.proprerty.infastructure.sourcesql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.onehs.propertybusiness.domain.Properties;
import vn.onehs.propertybusiness.repo.PropertiesRepo;
import vn.onehs.proprerty.infastructure.sourcesql.mapper.PropertiesSqlMapper;
import vn.onehs.proprerty.infastructure.sourcesql.repo.proeprties.PropertiesSqlRepo;

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
