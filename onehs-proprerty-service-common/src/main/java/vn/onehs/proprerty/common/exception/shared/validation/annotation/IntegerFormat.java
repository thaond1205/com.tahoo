package vn.onehs.proprerty.common.exception.shared.validation.annotation;

import vn.onehs.proprerty.common.exception.shared.validation.validator.IntegerValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {IntegerValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface IntegerFormat {
    String message() default " must is positive integer";

    int min() default 0;

    int max() default 1000000;

    boolean checkRange() default true;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
