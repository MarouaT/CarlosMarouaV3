package org.proxi.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Client extends Personne {

	private String email;
	@Embedded
	Adresse adresse;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="comptecourant_id",unique=true)
	CompteCourant compteCourant;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="compteepargne_id",unique=true)
	CompteEpargne compteEpargne;

	
	
	public Client() {
		
	}

	public Client(String nom, String prenom) {
		super(nom, prenom);

	}

	public Client(String nom, String prenom, String email, Adresse adresse, CompteCourant comptecourant,
			CompteEpargne compteepargne) {
		super(nom, prenom);
		this.email = email;
		this.adresse = adresse;
		this.compteCourant = comptecourant;
		this.compteEpargne = compteepargne;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	@Override
	public String toString() {
		return "Client [email=" + email + ", adresse=" + adresse + ", compteCourant=" + compteCourant
				+ ", compteEpargne=" + compteEpargne + "]";
	}



}
