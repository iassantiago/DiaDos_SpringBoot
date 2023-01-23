package com.example.demo.service;

import com.example.demo.dto.MateriaDTO;
import com.example.demo.entity.Materia;
import com.example.demo.repository.IMateriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class MateriaService implements IMateriaService {

    private final IMateriaRepository IMateriaRepository;

    public MateriaService(IMateriaRepository IMateriaRepository) {
        this.IMateriaRepository = IMateriaRepository;
    }

    @Override
    public void save(MateriaDTO materia) {
        this.IMateriaRepository.save(new Materia(materia));
    }

    @Override
    public void update(MateriaDTO materia) {
        if(this.IMateriaRepository.existsById(materia.getId())){
            this.IMateriaRepository.save(new Materia(materia));
        }
    }

    @Override
    public ArrayList<MateriaDTO> getAll() {
        List<Materia> list = (List<Materia>) this.IMateriaRepository.findAll();
        return (ArrayList<MateriaDTO>) list.stream()
                .map(MateriaDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        IMateriaRepository.delete(IMateriaRepository.findById(id).orElseThrow());
    }
}
