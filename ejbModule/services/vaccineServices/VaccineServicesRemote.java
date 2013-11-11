package services.vaccineServices;

import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import persistance.Vaccine;

@Remote
@Path("/restvaccine")
public interface VaccineServicesRemote {
	@PUT
	@Path("/createVaccine")
	@Consumes("application/xml")
	@Produces("text/plain")
	public void createVaccine(Vaccine vaccin);
	@POST
	@Path("/updateAdmin")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void updateAdmin(Vaccine vaccin);
	@DELETE
	@Path("/deleteAdmin")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void deleteAdmin(Vaccine vaccin);
	@GET
	@Path("/findAdminById")
	@Consumes("application/xml")
	@Produces("text/plain")
    public Vaccine findAdminById(int id_vaccin);
	@GET
	@Path("/getVaccin")
	@Consumes("application/xml")
	@Produces("text/plain")
    public List<Vaccine> getVaccin();

}
