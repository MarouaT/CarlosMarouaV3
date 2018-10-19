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

import org.proxi.spring.model.Conseiller;
/**
 * C'est l'interface qui contient les principaux méthodes pour les conseillers et qui contient les URL d'entrée pour chaque méthode et 
 * qui contient aussi le point d'entrée principale et les method utilisé pour l'exécutions de ces méthodes 
 * @author Carlos & Maroua  
 */
@Produces("application/xml,application/json")
@Consumes("application/xml,application/json")
@Path("/conseillerservice")
public interface IConseillerWS {

	@GET
	@Path("/conseillers/{id}")
	Conseiller getConseiller(@PathParam("id") String id);

	@GET
	@Path("/conseillers/")
	List<Conseiller> getConseillers();

	@PUT
	@Path("/conseillers/")
	Response updateConseiller(Conseiller c);

	@POST
	@Path("/conseillers/")
	Response addConseiller(Conseiller c);

	@DELETE
	@Path("/conseillers/{id}")
	Response deleteConseillers(@PathParam("id") String id);

}
