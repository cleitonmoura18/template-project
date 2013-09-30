package com.template.core.model.validation;

import br.com.caelum.vraptor.ioc.Component;

import com.template.common.annotation.MainDAO;
import com.template.common.util.string.RegexUtil;
import com.template.common.util.string.StringUtil;
import com.template.common.validation.ValidatorBase;
import com.template.common.validation.annotation.ValidationMethod;
import com.template.core.model.User;
import com.template.core.repository.UserDAO;


/**
 * 
 * Used to validate the User
 * 
 * @author Pedro Almir
 */
@Component
@MainDAO(UserDAO.class)
public class UserValidation extends ValidatorBase<UserDAO> {


	/**
	 * 
	 * @param user The User with fields to be validated
	 */
	@ValidationMethod
	public void validCorrectEmail(User user) {
		if (!StringUtil.isEmpty(user.getEmail()) && !RegexUtil.validEmail(user.getEmail())) {
			addError("user_email", "common.invalid");
		}
	}

}
