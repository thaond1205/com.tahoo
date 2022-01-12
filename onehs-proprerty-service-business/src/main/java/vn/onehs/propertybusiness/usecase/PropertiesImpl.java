package vn.onehs.propertybusiness.usecase;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.onehs.propertybusiness.domain.Properties;
import vn.onehs.propertybusiness.repo.PropertiesRepo;

import java.util.List;

@Service
@Slf4j
public class PropertiesImpl implements PropertiesUsecase{
    @Autowired
    private PropertiesRepo repo;

    @Override
    public List<Properties> getAll() {

        return repo.getAll();
    }
}
