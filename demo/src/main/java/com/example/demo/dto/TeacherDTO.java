package com.example.demo.dto;

import com.example.demo.entity.Teacher;

public class TeacherDTO {

    private Integer id;
    private String nombres;
    private String apellidos;
    private int cedula;
    private int edad;
    private String materia;

    public TeacherDTO(Integer id, String nombres, String apellidos, int cedula, int edad, String materia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }
    public TeacherDTO() {

    }

    public TeacherDTO(Teacher teacher) {
        this.id = teacher.getId();
        this.nombres = teacher.getNombres();
        this.apellidos = teacher.getApellidos();
        this.cedula = teacher.getCedula();
        this.edad = teacher.getEdad();
        this.materia = teacher.getMateria();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
