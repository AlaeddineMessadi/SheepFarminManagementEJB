package services.employeeServices;

import java.util.List;

import javax.ejb.Remote;

import persistance.Employee;

@Remote
public interface EmployeeServicesRemote {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee findEmployeeById(int idEmployee);
    public List<Employee> getEmployee();
}
