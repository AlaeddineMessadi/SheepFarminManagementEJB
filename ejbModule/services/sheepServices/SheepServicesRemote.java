package services.sheepServices;

import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.logging.Param;

import persistance.Monitoring;
import persistance.Sheep;
import persistance.Vaccine;

@Remote
@Path("/restsheep")
public interface SheepServicesRemote {

	@PUT
	@Path("/createSheep/{sheep}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void createSheep(@PathParam("sheep")Sheep sheep);
	@POST
	@Path("/updateSheep/{sheep}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void updateSheep(@PathParam("sheep")Sheep sheep);
	@DELETE
	@Path("/deleteSheep/{sheep}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void deleteSheep(@PathParam("sheep")Sheep sheep);
	@GET
	@Path("/findSheepById/{idsheep}")
	//@Consumes("application/xml")
	@Produces("application/json")
    public Sheep findSheepById(@PathParam("idsheep")int idSheep);
	@GET
	@Path("/getSheeps")
	//@Consumes("application/xml")
	@Produces("application/json")
    public List<Sheep> getSheeps();
	@PUT
	@Path("/vaccinTosheep/{sheep}/{listvaccin}")
	@Consumes("application/json")
	//@Produces("text/plain")
	public void vaccinTosheep(@PathParam("sheep")Sheep sheep,@PathParam("listvaccin") List<Vaccine> vaccines);
	@PUT
	@Path("/monitoringToSheep/{sheep}/{listmonitoring}")
	@Consumes("application/json")
	//@Produces("text/plain")
	public void monitoringToSheep(@PathParam("sheep") Sheep sheep,@PathParam("listmonitoring") List<Monitoring> monitorings);

}
