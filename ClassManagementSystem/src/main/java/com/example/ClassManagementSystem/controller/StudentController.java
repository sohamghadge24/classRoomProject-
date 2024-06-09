package com.example.ClassManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ClassManagementSystem.Entity.Student;
import com.example.ClassManagementSystem.Service.userService;

import java.util.List;

@RestController
@RequestMapping("/api/students/")
public class StudentController {

    private final userService studentService;

    @Autowired
    public StudentController(userService studentService) {
        this.studentService = studentService;
    }

    
    @GetMapping("/AllStudent")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students =(List<Student>) studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) {
        Student student = studentService.getUserById(studentId);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
   
    

    @PutMapping("/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(studentId, student);
        if (updatedStudent != null) {
            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//
//    @DeleteMapping("/{studentId}")
//    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) {
//        boolean success = studentService.deleteStudent(studentId);
//        if (success) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}