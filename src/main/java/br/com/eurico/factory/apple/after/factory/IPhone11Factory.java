package br.com.eurico.factory.apple.after.factory;

import br.com.eurico.factory.apple.after.model.IPhone;
import br.com.eurico.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
