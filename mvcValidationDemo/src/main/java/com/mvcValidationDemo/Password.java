package com.mvcValidationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target( {ElementType.METHOD , ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	public String message() default "Must contain #a";
	
	public Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
