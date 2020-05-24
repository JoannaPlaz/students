package pl.sda.javagdy2.spring.students.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.sda.javagdy2.spring.students.model.Student;

import java.util.List;
@Component

public class DBstudentDAO implements StudentDAO{

    @Override
    public void save(Student student) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
