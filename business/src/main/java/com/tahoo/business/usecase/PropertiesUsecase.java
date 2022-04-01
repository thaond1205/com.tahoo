package com.tahoo.business.usecase;

import org.springframework.stereotype.Repository;
import com.tahoo.business.domain.Properties;

import java.util.List;

@Repository
public interface PropertiesUsecase {
    List<Properties> getAll();
}
