package pl.sda.javagdy2.spring.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.javagdy2.spring.students.model.Student;
import pl.sda.javagdy2.spring.students.service.StudentService;

import java.util.Optional;

@Controller
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping("/add")
    public String studentAdd(Model model) {
        model.addAttribute("newStudent", new Student());
        return "student_form";
    }

    @PostMapping("/add")
    public String studentAdd(Student student) {

        studentService.add(student);
        return "redirect:/student/list";
    }

    @GetMapping("/list")
    public String studentList(Model model) {
        model.addAttribute("listOfStudents", studentService.getBazaDanych());
        return "student_list";
    }

    @GetMapping("/edit/{stud_id}")
    public String editStudent(Model model, @PathVariable(name = "stud_id") Long studentId) {
        return getStudentToEdit(model, studentId);
    }

    @GetMapping("/edit")
    public String editStudentParam(Model model, @RequestParam(name = "stud_id") Long studentId) {
        return getStudentToEdit(model, studentId);
    }

    private String getStudentToEdit(Model model, @RequestParam(name = "stud_id") Long studentId) {
        Optional<Student> optionalStudent = studentService.findStudent(studentId);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            model.addAttribute("newStudent", student);
            return "student_form";
        } else {
            return "redirect:/student/list";
        }
    }
    @GetMapping("/delete/{studentIdentifier}")
    public String deleteStudent(@PathVariable Long studentIdentifier) {
        studentService.deleteById(studentIdentifier);

        return "redirect:/student/list";
    }
    @GetMapping("/details")
    public String studentDetailsPage(Model model, @RequestParam Long studentIdentifier) {
        Optional<Student> optionalStudent = studentService.findStudent(studentIdentifier);
        if (optionalStudent.isPresent()) {

            Student student = optionalStudent.get();
            model.addAttribute("studentDetails", student);
            return "student-details";
        }
        return "redirect:/student/list";
    }
}
