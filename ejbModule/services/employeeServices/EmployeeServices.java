package services.employeeServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Employee;


/**
 * Session Bean implementation class EmployeeServices
 */
@Stateless
@LocalBean
public class EmployeeServices implements EmployeeServicesRemote, EmployeeServicesLocal {

	@PersistenceContext
	EntityManager emp ;
    /**
     * Default constructor. 
     */
    public EmployeeServices() {

    }

	@Override
	public void createEmployee(Employee employee) {
		emp.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		emp.merge(employee);
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		emp.remove(emp.merge(employee));
		
	}

	@Override
	public Employee findEmployeeById(int idEmployee) {
		
		return emp.find(Employee.class, idEmployee);
	}

	@Override
	public List<Employee> getEmployee() {
		
		return emp.createQuery("From Employee",Employee.class).getResultList();
	}
	
}