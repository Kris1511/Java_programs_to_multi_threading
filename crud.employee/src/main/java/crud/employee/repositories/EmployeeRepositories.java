package crud.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.employee.entities.Employee;

public interface EmployeeRepositories extends JpaRepository<Employee, Integer> {

}
