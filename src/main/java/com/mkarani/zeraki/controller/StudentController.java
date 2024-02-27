package com.mkarani.zeraki.controller;


import com.mkarani.zeraki.dto.StudentRequest;
import com.mkarani.zeraki.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Add a student and assign them a course
    @PostMapping("/new")
    public ResponseEntity<?> addStudent(@RequestBody StudentRequest studentDto) {
        studentService.addStudent(studentDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
