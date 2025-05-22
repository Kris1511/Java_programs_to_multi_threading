package crud.employee.services;

import java.util.List;

import crud.employee.entities.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	Employee searchEmployee(int id);
	
	List<Employee> fetchEmployee();

}
