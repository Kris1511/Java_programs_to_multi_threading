package crud.student_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.student_2.entities.Student;

public interface StrudentRepositories extends JpaRepository<Student, Integer> {

}
