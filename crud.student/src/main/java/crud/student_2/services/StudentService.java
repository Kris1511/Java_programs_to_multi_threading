package crud.student_2.services;

import java.util.List;

import crud.student_2.entities.Student;

public interface StudentService {
	
	void addStudent(Student stu);
	
	void updateStudent(Student stu);
	
	Student searchStudent(int id);
	
	void deleteStudent(int id);
	
	List<Student> fetchStudent();

}
