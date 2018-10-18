package org.proxi.spring.webservice;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.proxi.spring.dao.CrudClientDAO;
import org.proxi.spring.model.Client;
import org.proxi.spring.model.Virement;
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
		crudClientDAO.deleteById(Integer.valueOf(id));
		return Response.ok().build();
	}

//	@Override
//	public Response faireVirementComptesCourant(String id1, String id2, double montant) {
//		Optional<Client> optional = crudClientDAO.findById(Integer.valueOf(id1));
//		Optional<Client> optional2 = crudClientDAO.findById(Integer.valueOf(id2));
//
//		if (optional.get().getCompteCourant().getSoldeCourant() >= montant) {
//
//			optional.get().getCompteCourant()
//					.setSoldeCourant(optional.get().getCompteCourant().getSoldeCourant() - montant);
//			crudClientDAO.save(optional.get());
//			optional2.get().getCompteCourant()
//					.setSoldeCourant(optional2.get().getCompteCourant().getSoldeCourant() + montant);
//			crudClientDAO.save(optional2.get());
//
//		} else {
//			System.out.println("SOLDE INSUFISANT");
//		}
//
//		return Response.ok().build();
//	}

	@Override
	public Response faireVirementComptesCourant(String id1, String id2, Virement montantVirement) {
		
		Optional<Client> optional = crudClientDAO.findById(Integer.valueOf(id1));
		Optional<Client> optional2 = crudClientDAO.findById(Integer.valueOf(id2));

		if (optional.get().getCompteCourant().getSoldeCourant() >= montantVirement.getMontantVirement()) {

			optional.get().getCompteCourant()
					.setSoldeCourant(optional.get().getCompteCourant().getSoldeCourant() - montantVirement.getMontantVirement());
			crudClientDAO.save(optional.get());
			optional2.get().getCompteCourant()
					.setSoldeCourant(optional2.get().getCompteCourant().getSoldeCourant() + montantVirement.getMontantVirement());
			crudClientDAO.save(optional2.get());

		} else {
			System.out.println("SOLDE INSUFISANT");
		}

		return Response.ok().build();
	}

}
