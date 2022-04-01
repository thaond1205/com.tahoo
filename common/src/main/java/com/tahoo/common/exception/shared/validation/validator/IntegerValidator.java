package com.tahoo.common.exception.shared.validation.validator;

import com.tahoo.common.exception.shared.validation.annotation.IntegerFormat;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IntegerValidator implements ConstraintValidator<IntegerFormat, String> {

    private int min;

    private int max;

    private boolean checkRange;

    @Override
    public void initialize(IntegerFormat integerFormat) {
        min = integerFormat.min();
        max = integerFormat.max();
        checkRange = integerFormat.checkRange();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext cxt) {
        if (!StringUtils.isEmpty(value)) {
            try {
                int iValue = Integer.parseInt(value);
                return !checkRange || (iValue >= min && iValue <= max);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
