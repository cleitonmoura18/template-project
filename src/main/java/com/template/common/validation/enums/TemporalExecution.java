package com.template.common.validation.enums;

/**
 * 
 * Used to indicate whether the execution will be Before, After, or at both times of calls of methods of Controllers
 * 
 * @author
 */
public enum TemporalExecution {

	/**
	 * BEFORE
	 */
	BEFORE, 
	/**
	 * AFTER
	 */
	AFTER, 
	/**
	 * BOTH
	 */
	BOTH;

	/**
	 * DEFAULT_TEMPORAL
	 */
	public static final TemporalExecution DEFAULT_TEMPORAL = TemporalExecution.BEFORE;

}
