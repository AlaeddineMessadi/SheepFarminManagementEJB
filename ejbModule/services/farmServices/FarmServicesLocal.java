package services.farmServices;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import persistance.Batiment;
import persistance.Farm;

@Local
@Path("/restfarm")
public interface FarmServicesLocal {
	@PUT
	@Path("/createFarm")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void createFarm(Farm farm);
	@POST
	@Path("/updateFarm")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void updateFarm(Farm farm);
	@DELETE
	@Path("/deleteFarm")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void deleteFarm(Farm farm);
	@GET
	@Path("/findFarmById")
	@Consumes("application/xml")
	@Produces("text/plain")
    public Farm findFarmById(int idFarm);
	@GET
	@Path("/getFarms")
	@Consumes("application/xml")
	@Produces("text/plain")
    public List<Farm> getFarms();
	@PUT
	@Path("/batimentToFarm")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void batimentToFarm(Farm farm,List<Batiment> batiments);
}
