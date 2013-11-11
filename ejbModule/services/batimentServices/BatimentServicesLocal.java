package services.batimentServices;

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
import persistance.Employee;
import persistance.Sheep;

@Local
@Path("/restbatiment")
public interface BatimentServicesLocal {

	@PUT
	@Path("/createBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    public void createBatiment(Batiment batiment);
	@POST
	@Path("/updateBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    public void updateBatiment(Batiment batiment);
	@DELETE
	@Path("/deleteBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    public void deleteBatiment(Batiment batiment);
	@GET
	@Path("/findBatimentById")
	@Consumes("application/xml")
	@Produces("text/plain")
	    public Batiment findBatimentById(int idBatiment);
	@GET
	@Path("/getBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    public List<Batiment> getBatiment();
	@PUT
	@Path("/EmployeeToBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    void EmployeeToBatiment(Batiment batiment, List<Employee> employees);
	@PUT
	@Path("/SheepToBatiment")
	@Consumes("application/xml")
	@Produces("text/plain")
	    void SheepToBatiment(Batiment batiment, List<Sheep> sheeps);
}
