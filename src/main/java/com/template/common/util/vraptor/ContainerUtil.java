package com.template.common.util.vraptor;


import br.com.caelum.vraptor.ioc.Container;

import com.template.common.annotation.MainDAO;
import com.template.common.annotation.MainDAOInterface;
import com.template.common.repository.GenericDAO;


/**
 * Class with utility methods for the container object VRaptor
 * 
 */
public class ContainerUtil {

	/**
	 * 
	 * Use the container to return an instance of a DAO, 
	 * which is found in DAO annotation MainDAO
	 * 
	 * @param container
	 *            Object Container
	 * @param daoInterface
	 *            Some extent MainDAO interface, the method to be used setMainDAO
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void setMainDAO(Container container, MainDAOInterface daoInterface) {
		if (daoInterface.getClass().isAnnotationPresent(MainDAO.class)) {
			MainDAO mainDAO = daoInterface.getClass().getAnnotation(MainDAO.class);
			GenericDAO dao = container.instanceFor(mainDAO.value());
			dao.setContainer(container);
			daoInterface.setMainDAO(dao);
		}
	}

}
