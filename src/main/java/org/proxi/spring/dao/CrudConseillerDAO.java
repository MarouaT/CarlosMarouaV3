package org.proxi.spring.dao;

import org.proxi.spring.model.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudConseillerDAO extends JpaRepository<Conseiller, Integer> {

	// Methode Supplementaire : Mettre la methode du virement ici

//	List<Client> findAllClientByNom(String nom);
//
//	List<Client> findAllClientByLogin(String login);

}
