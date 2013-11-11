package services.sheepServices;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import persistance.Monitoring;
import persistance.Sheep;
import persistance.Vaccine;

@Local
@Path("/restsheep")
public interface SheepServicesLocal {

	@PUT
	@Path("/createSheep")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void createSheep(Sheep sheep);
	@POST
	@Path("/updateSheep")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void updateSheep(Sheep sheep);
	@DELETE
	@Path("/deleteSheep")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void deleteSheep(Sheep sheep);
	@GET
	@Path("/findSheepById")
	@Consumes("application/xml")
	@Produces("text/plain")
    public Sheep findSheepById(int idSheep);
	@GET
	@Path("/getSheeps")
	@Consumes("application/xml")
	@Produces("text/plain")
    public List<Sheep> getSheeps();
	@PUT
	@Path("/vaccinTosheep")
	@Consumes("application/xml")
	@Produces("text/plain")
	public void vaccinTosheep(Sheep sheep, List<Vaccine> vaccines);
	@PUT
	@Path("/monitoringToSheep")
	@Consumes("application/xml")
	@Produces("text/plain")
	public void monitoringToSheep(Sheep sheep, List<Monitoring> monitorings);
}
