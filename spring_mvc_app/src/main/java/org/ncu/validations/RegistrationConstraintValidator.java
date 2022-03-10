package org.ncu.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegistrationConstraintValidator implements ConstraintValidator<RegistrationCode, String>{

	String prefixCode;
	
	@Override
	public void initialize(RegistrationCode constraintAnnotation) {
		// TODO Auto-generated method stub
//		ConstraintValidator.super.initialize(constraintAnnotation);
		prefixCode=constraintAnnotation.value();
	
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
//		return false;
		return value.startsWith(prefixCode);
	}
	
	

}
