package org.proxi.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * C'est une classe abstraite qui contient l'id, le nom et le prénom de Clients ET de Conseillers, ces derniers héritent de cette classe. C'est a partir de cette classe que l'Id
 * va être autoincrementer
 * @author Carlos & Maroua  
 */
@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom) {
		super();
	}

	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
