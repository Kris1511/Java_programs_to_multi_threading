package crud.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entities.Employee;
import crud.employee.repositories.EmployeeRepositories;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepositories repo;
	
	public Employee loginEmployee(int id) {
		return repo.findById(id).get();
	}
	
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}
	
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
	public void deleteEmployee(Employee emp) {
		repo.delete(emp);
	}
	
	public Employee searchEmployee(int id) {
		return repo.findById(id).get();
	}
	
	public List<Employee> fetchEmployee() {
		return repo.findAll();
	}

}
