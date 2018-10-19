package org.proxi.spring.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * La classe Conseiller est l'utilisateur principal de l'application, c'est grâce à cette classe que l'ont va pouvoir attribuer un Login et un Password pour entrer dans l'application
 * @author Carlos & Maroua  
 */
@XmlRootElement
@Entity
public class Conseiller extends Personne {

	private String login;
	private String password;

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Conseiller() {
		super();

	}

	public Conseiller(int id, String nom, String prenom) {
		super(id, nom, prenom);

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Conseiller [login=" + login + ", password=" + password + ", getId()=" + getId() + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

	
}
