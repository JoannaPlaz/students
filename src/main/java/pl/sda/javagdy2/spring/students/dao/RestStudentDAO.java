package pl.sda.javagdy2.spring.students.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.sda.javagdy2.spring.students.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class RestStudentDAO implements StudentDAO {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public void save(Student student) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {

        String url = "http://localhost:8081/students";
        ResponseEntity<Student[]> students = restTemplate.getForEntity(url, Student[].class, HttpStatus.OK);
        Student[] body = students.getBody();
        return Arrays.asList(body);
    }

    @Override
    public void deleteById(Long id) {


    }
}
