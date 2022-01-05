package vn.onehs.propertybusiness.usecase;

import org.springframework.stereotype.Repository;
import vn.onehs.propertybusiness.domain.Properties;

import java.util.List;

@Repository
public interface PropertiesUsecase {
    List<Properties> getAll();
}
