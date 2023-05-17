package com.example.jpabasicsmay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    @Autowired StudentRepository studentRepository;
    @Autowired LibraryCardRepository cardRepository;

    public String addStudent(Student student,Department department) {
        LibraryCard card = new LibraryCard();
        card.setDepartment(department);
        card.setStudent(student);

        student.setLibraryCard(card);

        studentRepository.save(student);
        return "Student added successfully";
    }

    public Student getStudentById(int studentId) {

        return studentRepository.findById(studentId).get();
    }
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }

    public List<String> getAllByAge(int age) {
        List<Student> students = studentRepository.findByAge(age);
        List<String> names = new ArrayList<>();

        for (Student student: students) names.add(student.getName());
        return names;
    }

    public List<String> getAllByAgeAndMarks(int age, int marks) {
        List<Student> students = studentRepository.findByAgeAndMarks(age,marks);
        List<String> names = new ArrayList<>();
        for (Student student: students) names.add(student.getName());
        return names;
    }

    public List<String> getAllByAgeGreaterThan(int age) {
        List<Student> students = studentRepository.getAllStudentsGreaterThan(age);
        List<String> names = new ArrayList<>();
        for (Student student: students) names.add(student.getName());
        return names;
    }
}
