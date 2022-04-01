package com.tahoo.common.exception.shared.validation.annotation;


import com.tahoo.common.exception.shared.validation.validator.UUIDValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {UUIDValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface UUIDFormat {
    String message() default "{F.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
