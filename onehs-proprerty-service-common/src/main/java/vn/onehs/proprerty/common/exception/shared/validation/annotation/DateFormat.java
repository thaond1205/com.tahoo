package vn.onehs.proprerty.common.exception.shared.validation.annotation;

import vn.onehs.proprerty.common.exception.shared.validation.validator.DateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {DateValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface DateFormat {
    String message();

    String pattern();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
