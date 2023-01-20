package com.example.demo.service;

import com.example.demo.dto.StudentDTO;

import java.util.ArrayList;

public interface IStudentService {
    void save(StudentDTO student);

    void update(StudentDTO student);

    ArrayList<StudentDTO> getAll();

    void delete();
}
