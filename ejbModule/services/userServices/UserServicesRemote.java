package services.userServices;

import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import persistance.User;

@Remote
@Path("/restuser")
public interface UserServicesRemote {
	@PUT
	@Path("/createUser")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void createUser(User user);
	@POST
	@Path("/updateUser")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void updateUser(User user);
	@DELETE
	@Path("/deleteUser")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void deleteUser(User user);
	@GET
	@Path("/findUserById")
	@Consumes("application/xml")
	@Produces("text/plain")
    public User findUserById(int idUser);
	@GET
	@Path("/getUsers")
	@Consumes("application/xml")
	@Produces("text/plain")
    public List<User> getUsers();
	@GET
	@Path("/authenticate")
	@Consumes("application/xml")
	@Produces("text/plain")
    public User authenticate(String login, String password);
}
