package org.proxi.spring.model;

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
	@OneToOne
	@JoinColumn(name="comptecourant_id",unique=true)
	CompteCourant comptecourant;
	@OneToOne
	@JoinColumn(name="compteepargne_id",unique=true)
	CompteEpargne compteepargne;

	
	
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
		this.comptecourant = comptecourant;
		this.compteepargne = compteepargne;
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

	public CompteCourant getComptecourant() {
		return comptecourant;
	}

	public void setComptecourant(CompteCourant comptecourant) {
		this.comptecourant = comptecourant;
	}

	public CompteEpargne getCompteepargne() {
		return compteepargne;
	}

	public void setCompteepargne(CompteEpargne compteepargne) {
		this.compteepargne = compteepargne;
	}

}
