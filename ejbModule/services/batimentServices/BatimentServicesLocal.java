package services.batimentServices;

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
import persistance.Employee;
import persistance.Sheep;

@Local
@Path("/restbatiment")
public interface BatimentServicesLocal {


	@PUT
	@Path("/createBatiment/{batiment}")
	@Consumes("application/json")
	//@Produces("text/plain")
	    public void createBatiment(@PathParam("batiment")Batiment batiment);
	@POST
	@Path("/updateBatiment/{batiment}")
	@Consumes("application/json")
	//@Produces("text/plain")
	    public void updateBatiment(@PathParam("batiment")Batiment batiment);
	@DELETE
	@Path("/deleteBatiment/{batiment}")
	@Consumes("application/json")
//	@Produces("text/plain")
	    public void deleteBatiment(@PathParam("batiment")Batiment batiment);
	@GET
	@Path("/findBatimentById/{id}")
	//@Consumes("application/xml")
	@Produces("application/json")
	    public Batiment findBatimentById(@PathParam("id")int idBatiment);
	@GET
	@Path("/getBatiment")
	//@Consumes("application/xml")
	@Produces("application/json")
	    public List<Batiment> getBatiment();
	@PUT
	@Path("/EmployeeToBatiment/{batiment}/{listemployee}")
	@Consumes("application/json")
	//@Produces("text/plain")
	    void EmployeeToBatiment(@PathParam("batiment")Batiment batiment,@PathParam("listemployee") List<Employee> employees);
	@PUT
	@Path("/SheepToBatiment/{batiment/{sheeps}")
	@Consumes("application/json")
	//@Produces("text/plain")
	    void SheepToBatiment(@PathParam("batiment")Batiment batiment, @PathParam("sheeps")List<Sheep> sheeps);
}