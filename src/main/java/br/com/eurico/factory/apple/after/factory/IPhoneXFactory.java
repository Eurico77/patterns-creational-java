package br.com.eurico.factory.apple.after.factory;

import br.com.eurico.factory.apple.after.model.IPhone;
import br.com.eurico.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
