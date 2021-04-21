package br.com.eurico.abstractfactory.apple.factory.abstractFactory;

import br.com.eurico.abstractfactory.apple.model.certificate.Certificate;
import br.com.eurico.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
