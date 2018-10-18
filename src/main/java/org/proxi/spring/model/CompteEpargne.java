package org.proxi.spring.model;

import javax.persistence.Embeddable;

@Embeddable
public class CompteEpargne {

	private double soldeEpargne;

	
	
	public CompteEpargne() {
		super();
	}

	public double getSoldeEpargne() {
		return soldeEpargne;
	}

	public void setSoldeEpargne(double soldeEpargne) {
		this.soldeEpargne = soldeEpargne;
	}
	
}
