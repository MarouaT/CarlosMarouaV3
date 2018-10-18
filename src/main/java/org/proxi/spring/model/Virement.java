package org.proxi.spring.model;

import javax.xml.bind.annotation.XmlRootElement;

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
