package com.example.demo.repository;

import com.example.demo.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher, Integer> {
}
