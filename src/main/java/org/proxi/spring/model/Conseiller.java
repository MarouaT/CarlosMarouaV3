package org.proxi.spring.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

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

	public Conseiller(Long id, String nom, String prenom) {
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

}
