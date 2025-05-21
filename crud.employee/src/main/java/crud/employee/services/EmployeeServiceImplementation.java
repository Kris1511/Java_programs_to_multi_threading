package crud.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entities.Employee;
import crud.employee.repositories.EmployeeRepositories;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepositories repo;
	
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}

}
