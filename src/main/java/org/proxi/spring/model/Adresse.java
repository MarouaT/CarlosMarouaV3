package org.proxi.spring.model;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * C'est la classe adresse qui est réellement une fiche appartenant à clients puisqu'elle contient beaucoup du détails qui vont allourdir le tableau client
 *  on a choisit alors de la créer à part et de la lié à client avec la fonction embeddeble comme ça dans la base de donnée la table client aura aussi
 *  les attributs de l'adresse
 *  
 *  @author Carlos&Maroua
 */
@XmlRootElement
@Embeddable
public class Adresse {

	private int numero;
	private String rue;
	private String ville;
	private int codePostal;

	
	
	public Adresse() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

}
