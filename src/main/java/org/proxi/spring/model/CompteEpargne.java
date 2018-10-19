package org.proxi.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * La classe CompteEpargne représente un des comptes qui est associé à un client donc il a une relation one to one avec le client 
 * @author Carlos&Maroua  
 */
@XmlRootElement
@Entity
public class CompteEpargne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompteEpargne;
	private double soldeEpargne;
	@OneToOne(mappedBy = "compteEpargne")
	Client client;

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
