package org.proxi.spring.dao;

import org.proxi.spring.model.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * C'est l'interface qui hérite de JpaRepository qui nous permet de faire le CRUD des conseillers avec un minimum de code
 * 
 */
public interface CrudConseillerDAO extends JpaRepository<Conseiller, Integer> {

	

}
