package com.exampleapi.controllers;

import com.exampleapi.entities.Course;
import com.exampleapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Course>> findAllCourses() {
        List<Course> courseList = courseService.getAllCourses();
        return ResponseEntity.ok(courseList);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Course>> findCourseById(@PathVariable Long id) {
        Optional<Course> courseOptional = courseService.getCourseById(id);
        return ResponseEntity.ok(courseOptional);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        courseService.createCourse(course);
        return ResponseEntity.ok("Course created");
    }
}
