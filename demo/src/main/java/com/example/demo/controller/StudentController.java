package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService IStudentService;
    public StudentController(StudentService StudentService) {
    this.IStudentService = StudentService;
    }

    @GetMapping()
    public ResponseEntity<?> getStudentAll(){
        return ResponseEntity.ok().body(this.IStudentService.getAll());
    }

    @PostMapping()
    public String saveStudent(@RequestBody StudentDTO student){
        this.IStudentService.save(student);
        return "Registro Correcto";
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable("id") Integer id) {
        this.IStudentService.delete(id);
    }
}
