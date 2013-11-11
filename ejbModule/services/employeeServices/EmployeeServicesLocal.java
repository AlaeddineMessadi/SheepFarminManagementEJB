package services.employeeServices;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import persistance.Employee;

@Local
@Path("/restemployee")
public interface EmployeeServicesLocal {

	@PUT
	@Path("/createEmployee")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void createEmployee(Employee employee);
	@POST
	@Path("/updateEmployee")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void updateEmployee(Employee employee);
	@DELETE
	@Path("/deleteEmployee")
	@Consumes("application/xml")
	@Produces("text/plain")
    public void deleteEmployee(Employee employee);
	@GET
	@Path("/findEmployeeById")
	@Consumes("application/xml")
	@Produces("text/plain")
    public Employee findEmployeeById(int idEmployee);
	@GET
	@Path("/getEmployee")
	@Consumes("application/xml")
	@Produces("text/plain")
    public List<Employee> getEmployee();
}
