package org.proxi.spring.model;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * La classe virement est une classe "utilitaire" elle va nous permettre de faire un virement entre comptes. Elle permet de fixer le montant du virement et ainsi de faire passer un objet dans une methode du webservice. 
 * @author Carlos & Maroua  
 */
@XmlRootElement
public class Virement {

	double montantVirement;

	
	public Virement() {
		super();
	}

	public double getMontantVirement() {
		return montantVirement;
	}

	public void setMontantVirement(double montantVirement) {
		this.montantVirement = montantVirement;
	}
	
	
	
}
