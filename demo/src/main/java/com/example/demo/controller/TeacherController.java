package com.example.demo.controller;

import com.example.demo.dto.TeacherDTO;
import com.example.demo.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService ITeacherService;
    public TeacherController(TeacherService TeacherService) {
        this.ITeacherService = TeacherService;
    }

    @GetMapping()
    public ResponseEntity<?> getStudentAll(){
        return ResponseEntity.ok().body(this.ITeacherService.getAll());
    }

    @PostMapping()
    public String saveStudent(@RequestBody TeacherDTO teacher){
        this.ITeacherService.save(teacher);
        return "Registro Profesor Correcto";
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable("id") Integer id) {
        this.ITeacherService.delete(id);
    }
}
