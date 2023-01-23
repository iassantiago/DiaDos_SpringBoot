package com.example.demo.service;

import com.example.demo.dto.TeacherDTO;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.ITeacherRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService implements ITeacherservice{
    private final com.example.demo.repository.ITeacherRepository ITeacherRepository;

    public TeacherService(ITeacherRepository ITeacherRepository) {
        this.ITeacherRepository = ITeacherRepository;
    }

    @Override
    public void save(TeacherDTO teacher) {
        this.ITeacherRepository.save(new Teacher(teacher));
    }

    @Override
    public void update(TeacherDTO teacher) {
        if(this.ITeacherRepository.existsById(teacher.getId())){
            this.ITeacherRepository.save(new Teacher(teacher));
        }
    }

    @Override
    public ArrayList<TeacherDTO> getAll() {
        List<Teacher> list = (List<Teacher>) this.ITeacherRepository.findAll();
        return (ArrayList<TeacherDTO>) list.stream()
                .map(TeacherDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        ITeacherRepository.delete(ITeacherRepository.findById(id).orElseThrow());
    }
}
