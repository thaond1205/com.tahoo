package vn.onehs.proprerty.common.exception.shared.validation.validator;

import org.springframework.util.StringUtils;
import vn.onehs.proprerty.common.exception.shared.validation.annotation.PhoneFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<PhoneFormat, String> {

    private Pattern phonePattern = Pattern.compile("^\\d{9,12}$");

    @Override

    public void initialize(PhoneFormat numberFormat) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext cxt) {
        if (!StringUtils.isEmpty(value)) {
            Matcher matcher = phonePattern.matcher(value);
            return matcher.matches();
        }
        return true;
    }
}
