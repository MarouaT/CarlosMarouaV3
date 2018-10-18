package org.proxi.spring.dao;

//import java.util.List;

import org.proxi.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudClientDAO extends JpaRepository<Client, Integer> {

	// Methode Supplementaire : Mettre la methode du virement ici

//	public void virementComptesCourants(String id, String id2);

//	List<Client> findAllClientByNom(String nom);
//
//	List<Client> findAllClientByLogin(String login);

}
