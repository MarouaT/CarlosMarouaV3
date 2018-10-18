package org.proxi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.proxi.spring.dao.CrudClientDAO;
import org.proxi.spring.model.Adresse;
import org.proxi.spring.model.Client;
import org.proxi.spring.model.CompteCourant;
import org.proxi.spring.model.CompteEpargne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Carlosmarouav3ApplicationTests {
	@Autowired
	private CrudClientDAO crudClientDao;
	@Test
	public void contextLoads() {
//		assertNotNull(crudClientDao);
		Adresse a = new Adresse();
		CompteCourant cp= new CompteCourant();
		CompteEpargne ce = new CompteEpargne();
		ce.setSoldeEpargne(30);
		cp.setDecouvert(0);
		cp.setSoldeCourant(1596.3);
		a.setCodePostal(75000);
		a.setNumero(12);
		a.setRue("rue de l'indépendance");
		a.setVille("Paris");
		Client c = new Client();
		c.setAdresse(a);
		c.setEmail("badr@yahoo.com");
		c.setComptecourant(cp);
		c.setNom("Taghzalt");
		c.setPrenom("Badr");
		c.setCompteepargne(ce);
		crudClientDao.save(c);
		
		
	}

}
