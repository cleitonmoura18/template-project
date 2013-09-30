/**
 * 
 */
package com.template.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.template.common.model.enums.EnumProfile;


/**
 * @author EasyTeam, created by Pedro Oliveira
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Permission {
	
	/**
	 * @return the profiles
	 */
	EnumProfile[] value();
	
}
