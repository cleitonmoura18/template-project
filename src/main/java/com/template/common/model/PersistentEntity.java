package com.template.common.model;

import java.io.Serializable;

/**
 * Represents all persistent entity
 * 
 * @author
 *
 */
public interface PersistentEntity extends Serializable {

	/**
	 * @return user identification
	 */
	Long getId();
	
	/**
	 * @param id
	 */
	void setId(Long id);
}
