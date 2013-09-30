/**
 * 
 */
package com.template.common.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

import com.template.common.annotation.MainDAO;
import com.template.common.annotation.NoJson;
import com.template.common.annotation.PublicResource;
import com.template.common.controller.base.ControllerBase;
import com.template.common.repository.GenericDAO;

/**
 * @author Pedro Almir
 *
 */
@Resource
@MainDAO(GenericDAO.class)
@SuppressWarnings("rawtypes")
public class IndexController extends ControllerBase<GenericDAO>{
	/**
	 * Redirect to index.jsp
	 */
	@Get("/")
	@NoJson
	@PublicResource
	public void index(){
		
	}
	
	@Get("/test")
	@NoJson
	@PublicResource
	public void test(){
		
	}
}
