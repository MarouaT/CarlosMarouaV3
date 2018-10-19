package org.proxi.spring.model;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * La class virement c'est elle qui permet de faire un virement d'un compte à un compte et et qui nous permet de fixer le montant du virement 
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
