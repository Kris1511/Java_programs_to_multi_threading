package crud.student_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import crud.student_2.entities.Student;
import crud.student_2.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	// add Student
	@GetMapping("/add_student")
	public String addStudent() {
		return "add_student";
	}
	
	@PostMapping("/addStudent")
	public String add_Student(@ModelAttribute Student stu) {
		
		ss.addStudent(stu);
		System.out.println("Student fetched");
		
		return "index";
	}
	
	// update student
	@GetMapping("/update_student")
	public String updateStudent() {
		return "update_student";
	}
	
	@PostMapping("/updateStudent")
	public String update_Stuent(@ModelAttribute Student stu) {
		
		ss.updateStudent(stu);
		System.out.println("student updated");
		
		return "index";
	}
	
	// search student
	@GetMapping("/search_student")
	public String searchStudent() {
		return "search_student";
	}
	
	@PostMapping("/searchStudent")
	public String search_Student(@RequestParam int id, Model m) {
		
		Student stu = ss.searchStudent(id);
		m.addAttribute("student", stu);
		
		System.out.println("search data fetched");
		
		return "show_student";
	}
	
	// delete student
	@GetMapping("/delete_student")
	public String deleteStudnet() {
		return "delete_student";
	}
	
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		
		ss.deleteStudent(id);
		System.out.println("Student deleted");
		
		return "index";		
	}
	
	// see all student
	@GetMapping("/fetch_student")
	public String fetchData(Model m) {
		
	    List<Student> st = ss.fetchStudent();
	    m.addAttribute("all_student", st);
	    
	    return "all_student"; 
	}

}






