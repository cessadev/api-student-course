package com.exampleapi.repository;

import com.exampleapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s JOIN FETCH s.courses WHERE s.studentId = :studentId")
    Student findStudentWithCoursesById(@Param("studentId") Long studentId);

    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.courseId = :courseId")
    List<Student> findStudentsByCourseId(@Param("courseId") Long courseId);
}
