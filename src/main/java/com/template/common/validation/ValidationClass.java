package com.template.common.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to inform the authority which the classes of validation
 * 
 * @author
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ValidationClass {

	/**
	 * @return list of ValitadorBase
	 */
	@SuppressWarnings("rawtypes")
	Class<? extends ValidatorBase>[] value();

}