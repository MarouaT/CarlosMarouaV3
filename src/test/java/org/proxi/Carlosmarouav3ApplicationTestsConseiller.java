package org.proxi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.proxi.spring.dao.CrudConseillerDAO;
import org.proxi.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Carlosmarouav3ApplicationTestsConseiller {
	@Autowired
	private CrudConseillerDAO crudConseillerDao;
	
	@Test
	public void contextLoads() {
		
//	assertNotNull(crudConseillerDao);
		
//		Conseiller co1 = new Conseiller();
//		co1.setLogin("admin");
//		co1.setPassword("2018");
//		co1.setNom("Creach");
//		co1.setPrenom("Yann");
//		
//		crudConseillerDao.save(co1);
		
	}

}
