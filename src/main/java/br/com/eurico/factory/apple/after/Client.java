package br.com.eurico.factory.apple.after;

import br.com.eurico.factory.apple.after.factory.IPhone11ProFactory;
import br.com.eurico.factory.apple.after.factory.IPhoneFactory;
import br.com.eurico.factory.apple.after.factory.IPhoneXFactory;
import br.com.eurico.factory.apple.after.factory.IPhoneXSMaxFactory;
import br.com.eurico.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
		
		System.out.println("\n\n### Ordering an iPhone XSMax");
		IPhone iphone3 = iphoneXSMaxFactory.orderIPhone();
		System.out.println(iphone3);
	}
}
