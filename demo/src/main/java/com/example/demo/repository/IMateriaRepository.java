package com.example.demo.repository;

import com.example.demo.entity.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends CrudRepository<Materia, Integer> {
}
