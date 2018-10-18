package org.proxi.spring.model;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;
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
