package services.vaccineServices;

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

import persistance.Vaccine;

@Remote
@Path("/restvaccine")
public interface VaccineServicesRemote {
	@PUT
	@Path("/createVaccine/{vaccin}")
	@Consumes("application/json")
	//@Produces("text/plain")
	public void createVaccine(@PathParam("vaccin")Vaccine vaccin);
	@POST
	@Path("/updateVaccin/{vaccin}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void updateAdmin(@PathParam("vaccin")Vaccine vaccin);
	@DELETE
	@Path("/deleteVaccin/{vaccin}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void deleteAdmin(@PathParam("vaccin")Vaccine vaccin);
	@GET
	@Path("/findvaccinById/{idvaccin}")
	//@Consumes("application/xml")
	@Produces("application/json")
    public Vaccine findAdminById(@PathParam("idvaccin") int id_vaccin);
	@GET
	@Path("/getVaccin")
	//@Consumes("application/xml")
	@Produces("application/json")
    public List<Vaccine> getVaccin();

}
