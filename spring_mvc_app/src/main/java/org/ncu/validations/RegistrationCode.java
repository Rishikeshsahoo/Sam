package org.ncu.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RegistrationConstraintValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RegistrationCode {
	public String value() default "20CSU";
	public String message() default "must be preffixed with 20CSU";
	
	
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};
	
}
