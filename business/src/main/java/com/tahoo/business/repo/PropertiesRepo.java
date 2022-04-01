package com.tahoo.business.repo;

import com.tahoo.business.domain.Properties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertiesRepo {
    List<Properties> getAll();
}
