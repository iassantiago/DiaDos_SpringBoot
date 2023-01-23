package com.example.demo.service;

import com.example.demo.dto.TeacherDTO;

import java.util.ArrayList;

public interface ITeacherservice {
    void save(TeacherDTO teacher);

    void update(TeacherDTO teacher);

    ArrayList<TeacherDTO> getAll();

    void delete(Integer id);
}
