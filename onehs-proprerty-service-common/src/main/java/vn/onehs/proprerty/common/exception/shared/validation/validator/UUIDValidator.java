package vn.onehs.proprerty.common.exception.shared.validation.validator;

import org.springframework.util.StringUtils;
import vn.onehs.proprerty.common.exception.shared.validation.annotation.UUIDFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.UUID;

public class UUIDValidator implements ConstraintValidator<UUIDFormat, String> {

    @Override
    public boolean isValid(String uuidInput, ConstraintValidatorContext cxt) {
        if (!StringUtils.isEmpty(uuidInput)) {
            try {
                UUID.fromString(uuidInput);
            } catch (IllegalArgumentException exception) {
                return false;
            }
        }
        return true;
    }
}
