package com.example.demo.service;

import com.example.demo.dto.MateriaDTO;
import com.example.demo.dto.StudentDTO;

import java.util.ArrayList;

public interface IMateriaService {
    void save(MateriaDTO materia);

    void update(MateriaDTO materia);

    ArrayList<MateriaDTO> getAll();

    void delete(Integer id);
}
