package com.exampleapi.services;

import com.exampleapi.entities.Student;
import com.exampleapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student getStudentWithCoursesById(Long studentId) {
        return studentRepository.findStudentWithCoursesById(studentId);
    }

    public List<Student> getStudentsByCourseId(Long courseId) {
        return studentRepository.findStudentsByCourseId(courseId);
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }
}
