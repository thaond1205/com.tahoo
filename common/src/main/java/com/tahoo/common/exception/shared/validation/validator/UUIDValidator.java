package com.tahoo.common.exception.shared.validation.validator;

import com.tahoo.common.exception.shared.validation.annotation.UUIDFormat;
import org.springframework.util.StringUtils;

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
