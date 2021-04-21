package br.com.eurico.abstractfactory.app.service.factory;

import br.com.eurico.abstractfactory.app.service.services.CarService;
import br.com.eurico.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
