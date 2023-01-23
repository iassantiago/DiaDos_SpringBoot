package com.example.demo.dto;

import com.example.demo.entity.Materia;
import com.example.demo.entity.Teacher;

public class MateriaDTO {
    private Integer id;
    private String alumnos;
    private String maestro;
    private String horario;
    private String tema;

    public MateriaDTO(Integer id, String alumnos, String maestro, String horario, String tema) {
        this.id = id;
        this.alumnos = alumnos;
        this.maestro = maestro;
        this.horario = horario;
        this.tema = tema;
    }
    public MateriaDTO(Materia materia) {
        this.id = materia.getId();
        this.alumnos = materia.getAlumnos();
        this.maestro = materia.getMaestro();
        this.horario = materia.getHorario();
        this.tema = materia.getTema();
    }

    public MateriaDTO() {
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
