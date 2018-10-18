package org.proxi;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.proxi.spring.dao.CrudConseillerDAO;
import org.proxi.spring.model.Conseiller;
import org.proxi.spring.webservice.ConseillerWSImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Carlosmarouav3ApplicationTestsConseiller {
	@Autowired
	private CrudConseillerDAO crudConseillerDao;
	
	@Autowired
	private ConseillerWSImpl conseillerWSImpl;
	
	@Test
	public void contextLoads() {
		
//	assertNotNull(crudConseillerDao);
		
		//TEST METHODE SAVE
		
//		Conseiller co1 = new Conseiller();
//		co1.setLogin("admin5");
//		co1.setPassword("2018");
//		co1.setNom("Creach5");
//		co1.setPrenom("Yann5");
//		
//		crudConseillerDao.save(co1);
		
		
		// TEST METHODE FindAll
		
//		System.out.println(crudConseillerDao.findAll());
		
		// Test Methode REMOVE
		
		
//		crudConseillerDao.deleteById(1);
		
//		conseillerWSImpl.deleteConseillers("2");
		
		//TEST Update
		
//		Optional<Conseiller> c = crudConseillerDao.findById(3);
//		c.get().setNom("CREACH");
//		crudConseillerDao.save(c.get());
		
		// Test Update sur REST OK
		
		
		
		
		
	}

}
