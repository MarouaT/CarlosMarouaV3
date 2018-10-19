package org.proxi.spring.model;


import javax.persistence.Entity;
/**
 * La class compte courant représente le compte qui est associé à un client donc il a une relation one to one avec le client 
 * @author Carlos & Maroua  
 */
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * La classe CompteCourant représente un des comptes qui est associé à un client donc il a une relation one to one avec le client 
 * @author Carlos & Maroua  
 */
@XmlRootElement
@Entity
public class CompteCourant {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idCompteCourant;
	private double decouvert;
	private double soldeCourant;
	@OneToOne(mappedBy="compteCourant")
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
