package services.farmServices;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import persistance.Batiment;
import persistance.Farm;

@Local
@Path("/restfarm")
public interface FarmServicesLocal {
	@PUT
	@Path("/createFarm/{farm}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void createFarm(@PathParam("farm")Farm farm);
	@POST
	@Path("/updateFarm/{farm}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void updateFarm(@PathParam("farm")Farm farm);
	@DELETE
	@Path("/deleteFarm/{farm}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void deleteFarm(@PathParam("farm")Farm farm);
	@GET
	@Path("/findFarmById/{idfarm}")
	//@Consumes("application/json")
	@Produces("application/json")
    public Farm findFarmById(@PathParam("idfarm")int idFarm);
	@GET
	@Path("/getFarms")
	//@Consumes("application/xml")
	@Produces("application/json")
    public List<Farm> getFarms();
	@PUT
	@Path("/batimentToFarm/{farm}/{listbatimenttofarm}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void batimentToFarm(@PathParam("farm")Farm farm,@PathParam("listbatimenttofarm")List<Batiment> batiments);
}
