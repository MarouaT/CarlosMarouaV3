package org.proxi.spring.webservice;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.proxi.spring.dao.CrudClientDAO;
import org.proxi.spring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clientWebService")
public class ClientWSImpl implements IClientWS {

	
	@Autowired
	private CrudClientDAO crudClientDAO;

	@Override
	public Client getClient(String id) {
		Optional<Client> optional = crudClientDAO.findById(Integer.valueOf(id));
		return optional.get();
	}

	@Override
	public List<Client> getClients() {
		return crudClientDAO.findAll();
	}

	@Override
	public Response updateClient(Client c) {
		return null;
	}

	@Override
	public Response addClient(Client c) {
		crudClientDAO.save(c);
		return Response.ok().build();
	}

	@Override
	public Response deleteClients(String id) {

		return null;
	}

}
