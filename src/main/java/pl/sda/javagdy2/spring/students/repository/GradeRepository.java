package pl.sda.javagdy2.spring.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.javagdy2.spring.students.model.Grade;
import pl.sda.javagdy2.spring.students.model.Student;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
