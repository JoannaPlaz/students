package pl.sda.javagdy2.spring.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.javagdy2.spring.students.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
