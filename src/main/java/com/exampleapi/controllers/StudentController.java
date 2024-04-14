package com.exampleapi.controllers;

import com.exampleapi.entities.Student;
import com.exampleapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Student>> findStudentById(@PathVariable Long id) {
        Optional<Student> studentOptional = studentService.getStudentById(id);
        return ResponseEntity.ok(studentOptional);
    }

    // Consult a particular student next to the courses to which it is associated.
    @GetMapping("/findStudentWithCoursesById/{studentId}")
    public ResponseEntity<Student> findStudentWithCourses(@PathVariable Long studentId) {
        Student studentWithCourses = studentService.getStudentWithCoursesById(studentId);
        return ResponseEntity.ok(studentWithCourses);
    }

    // Consult students who are associated with a given course
    @GetMapping("/findStudentsByCourseId/{courseId}")
    public ResponseEntity<List<Student>> findStudentsByCourseId(@PathVariable Long courseId) {
        List<Student> studentList = studentService.getStudentsByCourseId(courseId);
        return ResponseEntity.ok(studentList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok("Student created");
    }
}
