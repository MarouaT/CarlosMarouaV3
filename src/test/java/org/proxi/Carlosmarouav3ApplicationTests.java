package org.proxi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.proxi.spring.dao.CrudClientDAO;
import org.proxi.spring.model.Adresse;
import org.proxi.spring.model.Client;
import org.proxi.spring.model.CompteCourant;
import org.proxi.spring.model.CompteEpargne;
import org.proxi.spring.webservice.ClientWSImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Carlosmarouav3ApplicationTests {
	@Autowired
	private CrudClientDAO crudClientDao;

	@Autowired
	private ClientWSImpl clientWSImpl;
	
	@Test
	public void contextLoads() {

//		assertNotNull(crudClientDao);

		//Créer un client:

//		Client c = new Client();
//		Adresse a = new Adresse();
//		CompteCourant cp = new CompteCourant();
//		CompteEpargne ce = new CompteEpargne();
////
//		ce.setSoldeEpargne(0);
//		cp.setDecouvert(0);
//		cp.setSoldeCourant(1500);
//		a.setCodePostal(75019);
//		a.setNumero(9);
//		a.setRue("rue du l'opéra");
//		a.setVille("Paris");
//		c.setEmail("Diea@yahoo.com");
//		c.setNom("mande");
//		c.setPrenom("Marlon");
//		c.setAdresse(a);
//		c.setCompteCourant(cp);
//		c.setCompteEpargne(ce);
//		
//		crudClientDao.save(c);

		//Supprimer un client:
<<<<<<< HEAD
		
		
		//Virement avec montant dans la methode
		
		
//		clientWSImpl.faireVirementComptesCourant("2", "5", 200);
		

=======
//		crudClientDao.deleteById(5);
		//Modifier un client: 
		Client c =crudClientDao.getOne(14);
		c.setNom("Khemiri");
		crudClientDao.save(c);
>>>>>>> 59f94f6b029a8c8698462f2c904a76a5478fc8bf
	}

}
