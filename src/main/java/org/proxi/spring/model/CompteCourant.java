package org.proxi.spring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class CompteCourant {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idCompteCourant;
	private double decouvert;
	private double soldeCourant;
	@OneToOne(mappedBy="comptecourant")
	Client client;

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
