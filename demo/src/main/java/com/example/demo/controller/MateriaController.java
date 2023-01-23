package com.example.demo.controller;

import com.example.demo.dto.MateriaDTO;
import com.example.demo.service.MateriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    private final MateriaService IMateriaService;
    public MateriaController(MateriaService MateriaService) {
        this.IMateriaService = MateriaService;
    }

    @GetMapping()
    public ResponseEntity<?> getMateriaAll(){
        return ResponseEntity.ok().body(this.IMateriaService.getAll());
    }

    @PostMapping()
    public String saveMateria(@RequestBody MateriaDTO materia){
        this.IMateriaService.save(materia);
        return "Registro de Materia Correcto";
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable("id") Integer id) {
        this.IMateriaService.delete(id);
    }

}
