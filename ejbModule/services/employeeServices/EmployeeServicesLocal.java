package services.employeeServices;

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

import persistance.Employee;

@Local
@Path("/restemployee")
public interface EmployeeServicesLocal {

	@PUT
	@Path("/createEmployee/{employee}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void createEmployee(@PathParam("employee")Employee employee);
	@POST
	@Path("/updateEmployee/{employee}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void updateEmployee(@PathParam("employee")Employee employee);
	@DELETE
	@Path("/deleteEmployee/{employee}")
	@Consumes("application/json")
	//@Produces("text/plain")
    public void deleteEmployee(@PathParam("employee")Employee employee);
	@GET
	@Path("/findEmployeeById/{id}")
	//@Consumes("application/json")
	@Produces("application/json")
    public Employee findEmployeeById(@PathParam("id")int idEmployee);
	@GET
	@Path("/getEmployee")
	//@Consumes("application/xml")
	@Produces("application/json")
    public List<Employee> getEmployee();
}
