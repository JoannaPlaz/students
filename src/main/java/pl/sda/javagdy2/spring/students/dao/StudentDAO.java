package pl.sda.javagdy2.spring.students.dao;

import pl.sda.javagdy2.spring.students.model.Student;

import java.util.List;

public interface StudentDAO {


    void save(Student student);
    Student findById (Long id);
    List<Student> findAll ();
    void deleteById(Long id);
}
