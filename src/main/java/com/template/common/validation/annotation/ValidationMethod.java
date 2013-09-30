package com.template.common.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.template.common.validation.enums.TemporalExecution;

/**
 * Reports that the methods are annotated with this annotation validation methods
 * 
 * @author
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ValidationMethod {

	/**
	 * An array with the restrictions of the method validation
	 * 
	 * @return restriction element
	 */
	RestrictionElement[] restriction() default {};

	/**
	 * In that time the method is executed against the method
	 * call controllers (Before, After, or Both)
	 * 
	 * @return temporal execution
	 */
	TemporalExecution when() default TemporalExecution.BEFORE;

}
