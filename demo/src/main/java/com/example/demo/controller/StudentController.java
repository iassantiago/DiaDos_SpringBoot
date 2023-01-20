package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    // @Autowired
    // private StudentService StudentService;
    private final StudentService StudentService;
    public StudentController(StudentService StudentService) {
    this.StudentService = StudentService;
    }

    @GetMapping()
    public ResponseEntity<?> getStudentAll(){
        return ResponseEntity.ok().body(this.StudentService.getAll());
    }

    @PostMapping()
    public String saveStudent(@RequestBody StudentDTO student){
        this.StudentService.save(student);
        return "Registro Correcto";
}}
