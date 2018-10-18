package org.proxi.spring.webservice;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.proxi.spring.dao.CrudConseillerDAO;
import org.proxi.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ConseillerWebService")
public class ConseillerWSImpl implements IConseillerWS {

	@Autowired
	private CrudConseillerDAO crudConseillerDAO;
	
	

	@Override
	public Conseiller getConseiller(String id) {
		Optional<Conseiller> optional = crudConseillerDAO.findById(Integer.valueOf(id));
		return optional.get();
	}

	@Override
	public List<Conseiller> getConseillers() {
		return crudConseillerDAO.findAll();
	}

	@Override
	public Response updateConseiller(Conseiller c) {
		crudConseillerDAO.save(c);
		return Response.ok().build();
	}

	@Override
	public Response addConseiller(Conseiller c) {
		crudConseillerDAO.save(c);
		return Response.ok().build();
	}

	@Override
	public Response deleteConseillers(String id) {
		int intId = Integer.valueOf(id);
		crudConseillerDAO.deleteById(intId);
		return Response.ok().build();
	}

}
