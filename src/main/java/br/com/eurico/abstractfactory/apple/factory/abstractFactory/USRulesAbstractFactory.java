package br.com.eurico.abstractfactory.apple.factory.abstractFactory;

import br.com.eurico.abstractfactory.apple.model.certificate.Certificate;
import br.com.eurico.abstractfactory.apple.model.certificate.USCertificate;
import br.com.eurico.abstractfactory.apple.model.packing.Packing;
import br.com.eurico.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
