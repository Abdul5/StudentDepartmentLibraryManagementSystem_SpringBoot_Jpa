package com.example.jpabasicsmay.controller;


import com.example.jpabasicsmay.Department;
import com.example.jpabasicsmay.Student;
import com.example.jpabasicsmay.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student, @RequestParam("department") Department department) {
        return studentService.addStudent(student,department);
    }

    @GetMapping("/get/{id}")

    public Student getStudentById(@PathVariable int id) {

        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/get_by_age")
    public List<String> getAllByAge(@RequestParam("age") int age) {
        return studentService.getAllByAge(age);
    }

    @GetMapping("/get_by_age_marks")
    public List<String> getAllByAgeAndMarks(@RequestParam("age") int age,@RequestParam("marks") int marks) {
        return studentService.getAllByAgeAndMarks(age,marks);
    }

    @GetMapping("/get_age_greater")
    public List<String> getAllByAgeGreaterThan(@RequestParam("age") int age) {
        return studentService.getAllByAgeGreaterThan(age);
    }
}
