package crud.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crud.employee.entities.Employee;
import crud.employee.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	// add employee
	@GetMapping("/add")
	public String addEmp() {
		return "add_employee";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Employee emp) {
		
		service.addEmployee(emp);
		System.out.println("Data fetched.");
		
		return "index";
		
	}
	
	// update employee
	@GetMapping("/update_emp")
	public String updateEmp() {
		return "update_employee";
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp) {
		
		service.addEmployee(emp);
		System.out.println("Data has been updated");
		
		return "index";
	}
	
	// delete employee
	@GetMapping("/delete_emp")
	public String deleteEmp() {
		return "delete_employee";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@ModelAttribute Employee emp) {
		
		service.deleteEmployee(emp);
		System.out.println("Deleted one of the data");
		
		return "index";
	}
	
	// search employee
	@GetMapping("/search_emp")
	public String searchEmp() {
		return "search_employee";
	}	
	
	@PostMapping("/search")
	public String searchEmployee(@RequestParam int id, Model m) {
		
		Employee emp = service.searchEmployee(id);
		m.addAttribute("employee", emp);
		System.out.println("Particular data showed up as per your id and name");
		
		return "show_employee";
		
	}
	
	// see all employee
	@GetMapping("/all_emp")
	public String seeEmp() {
		return "see_all_employee";
	}

}
