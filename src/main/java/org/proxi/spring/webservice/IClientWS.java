package org.proxi.spring.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.proxi.spring.model.Client;
import org.proxi.spring.model.Virement;
/**
 * C'est l'interface qui contient les principales méthodes pour les clients et qui contient les URL d'entrée pour chaque méthode. 
 * Ainsi elle contient aussi le point d'entrée (EndPoint) principal et les methodes HTTP utilisées pour l'exécution de ces méthodes
 * @author Carlos & Maroua  
 */
@Produces("application/xml,application/json")
@Consumes("application/xml,application/json")
@Path("/clientservice")
public interface IClientWS {

	@GET
	@Path("/clients/{id}")
	Client getClient(@PathParam("id") String id);

	@GET
	@Path("/clients/")
	List<Client> getClients();

	@PUT
	@Path("/clients/")
	Response updateClient(Client c);

	@POST
	@Path("/clients/")
	Response addClient(Client c);

	@DELETE
	@Path("/clients/{id}")
	Response deleteClients(@PathParam("id") String id);

	@PUT
	@Path("/clients/virement/{id1}/{id2}")
	Response faireVirementComptesCourant(@PathParam("id1") String id1, @PathParam("id2") String id2, Virement montantVirement);
	
}
