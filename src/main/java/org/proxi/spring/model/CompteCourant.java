package org.proxi.spring.model;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Embeddable
public class CompteCourant {

	private double decouvert;
	private double soldeCourant;

	public CompteCourant() {
		super();
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public double getSoldeCourant() {
		return soldeCourant;
	}

	public void setSoldeCourant(double soldeCourant) {
		this.soldeCourant = soldeCourant;
	}

}
