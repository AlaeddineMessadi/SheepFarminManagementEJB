package services.userServices;

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

import persistance.User;


@Remote
@Path("/restuser")
public interface UserServicesRemote {
	/*@POST
	@Path("/createUser/{userr}")
	@Consumes("application/json")
	//@Produces("text/plain")*/ 
    public void createUser(@PathParam("user")User user);
	/*@PUT
	@Path("/updateUser/{user}")
	@Consumes("application/json")
	//@Produces("text/plain")*/
    public void updateUser(@PathParam("user")User user);
	/*@DELETE
	@Path("/deleteUser/{users}")
	@Consumes("application/json")
	//@Produces("text/plain") */
    public void deleteUser(@PathParam("user") User user);
   /* @GET
	@Path("/findUserById/{idUser}")
	//@Consumes("application/xml") 
	@Produces("application/json")*/
    public User findUserById(@PathParam("idUser")int idUser);
	@GET
	@Path("/getUsers")
	//@Consumes("application/xml")
	@Produces("application/json")
    public List<User> getUsers();
	@GET
	@Path("/authenticate/{login}/{password}")
	//@Consumes("application/xml")
	@Produces("application/json")
    public User authenticate(@PathParam("login")String login,@PathParam("password") String password);
}
