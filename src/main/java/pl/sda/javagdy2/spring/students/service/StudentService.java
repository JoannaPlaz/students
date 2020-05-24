package pl.sda.javagdy2.spring.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import pl.sda.javagdy2.spring.students.dao.StudentDAO;
import pl.sda.javagdy2.spring.students.model.Student;
import pl.sda.javagdy2.spring.students.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
 //   private List<Student> bazaDanych = new ArrayList<>();

//    @Autowired
//    private StudentRepository studentRepository;
    @Autowired
    StudentDAO studentDAO;


    public void add(Student student){
 //       studentRepository.save(student);
        studentDAO.save(student);

    }

    public Optional<Student> findStudent(Long id){
  //      return studentRepository.findById(id);
        return Optional.of(studentDAO.findById(id));
    }

    public List<Student> getBazaDanych(){
//       return studentRepository.findAll();
        return studentDAO.findAll();
    }

    public void deleteById(Long studentIdentifier) {
//        studentRepository.deleteById(studentIdentifier);
        studentDAO.deleteById(studentIdentifier);
    }


}

