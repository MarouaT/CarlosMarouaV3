package org.proxi.spring.dao;



import org.proxi.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * C'est l'interface qui hérite de JpaRepository qui nous permet de faire le CRUD des clients avec un minimum de code car les methodes du CRUD sont comprises
 * 
 */
public interface CrudClientDAO extends JpaRepository<Client, Integer> {


}
