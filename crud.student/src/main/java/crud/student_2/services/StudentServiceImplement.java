package crud.student_2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.student_2.entities.Student;
import crud.student_2.repositories.StrudentRepositories;

@Service
public class StudentServiceImplement implements StudentService {
	
	@Autowired
	StrudentRepositories repo;
	
	public void addStudent(Student stu) {
		repo.save(stu);
	}
	
	public void updateStudent(Student stu) {
		repo.save(stu);
	}
	
	public Student searchStudent(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
	
	public List<Student> fetchStudent() {
		return repo.findAll();
	}

}
