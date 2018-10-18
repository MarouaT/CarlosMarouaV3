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

@Produces("application/xml,application/json")
@Consumes("application/xml,application/json")
@Path("/Conseillerservice")
public interface IConseillerWS {

	@GET
	@Path("/Conseillers/{id}")
	Conseiller getConseiller(@PathParam("id") String id);

	@GET
	@Path("/Conseillers/")
	List<Conseiller> getConseillers();

	@PUT
	@Path("/Conseillers/")
	Response updateConseiller(Conseiller c);

	@POST
	@Path("/Conseillers/")
	Response addConseiller(Conseiller c);

	@DELETE
	@Path("/Conseillers/{id}")
	Response deleteConseillers(@PathParam("id") String id);

}
