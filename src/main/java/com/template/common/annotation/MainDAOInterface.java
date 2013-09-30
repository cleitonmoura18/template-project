package com.template.common.annotation;

import com.template.common.repository.GenericDAO;

/**
 * 
 * Classes that implement the interface will be able to have the MainDAO injected, 
 * working together with the notation MainDAO
 * 
 * 
 * @author
 */
@SuppressWarnings("rawtypes")
public interface MainDAOInterface<E extends GenericDAO> {

	/**
	 * Sets the corresponding GenericDAO
	 * 
	 * @param mainDAO
	 */
	void setMainDAO(E mainDAO);

	/**
	 * @return o GenericDAO
	 */
	E getMainDAO();

}
