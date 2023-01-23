package com.example.demo.entity;

import com.example.demo.dto.MateriaDTO;
import com.example.demo.dto.StudentDTO;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String alumnos;
    private String maestro;
    private String horario;
    private String tema;

    public Materia(Integer id, String alumnos, String maestro, String horario, String tema) {
        this.id = id;
        this.alumnos = alumnos;
        this.maestro = maestro;
        this.horario = horario;
        this.tema = tema;
    }

    public Materia(MateriaDTO materia) {
        this.id = materia.getId();
        this.alumnos = materia.getAlumnos();
        this.maestro = materia.getMaestro();
        this.horario = materia.getHorario();
        this.tema = materia.getTema();
    }

    public Materia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
