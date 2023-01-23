package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService{
    private final IStudentRepository IStudentRepository;

    public StudentService(IStudentRepository IStudentRepository) {
        this.IStudentRepository = IStudentRepository;
    }

    @Override
    public void save(StudentDTO student) {
        this.IStudentRepository.save(new Student(student));
    }

    @Override
    public void update(StudentDTO student) {

    }

    @Override
    public ArrayList<StudentDTO> getAll() {
        List<Student> list = (List<Student>) this.IStudentRepository.findAll();
        return (ArrayList<StudentDTO>) list.stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    @Override
    public void delete() {

    }
}
