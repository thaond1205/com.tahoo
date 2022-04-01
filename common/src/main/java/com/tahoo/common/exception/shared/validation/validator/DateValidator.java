package com.tahoo.common.exception.shared.validation.validator;

import com.tahoo.common.exception.shared.validation.annotation.DateFormat;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;

public class DateValidator implements ConstraintValidator<DateFormat, String> {

    private String pattern;

    @Override
    public void initialize(DateFormat dateFormat) {
        pattern = dateFormat.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext cxt) {
        if (!StringUtils.isEmpty(value)) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            try {
                sdf.parse(value);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
