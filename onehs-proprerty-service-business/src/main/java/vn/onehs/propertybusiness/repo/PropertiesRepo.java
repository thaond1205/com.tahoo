package vn.onehs.propertybusiness.repo;

import org.springframework.stereotype.Repository;
import vn.onehs.propertybusiness.domain.Properties;

import java.util.List;

@Repository
public interface PropertiesRepo {
    List<Properties> getAll();
}
