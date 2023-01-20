package com.example.demo.dto;

import com.example.demo.entity.Student;

public class StudentDTO {
    private  String nombre;
    private  String apellidos;
    private int Cedula;
    private int edad;
    private String materia;

    public StudentDTO(String nombre, String apellidos, int cedula, int edad, String materia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }
    public StudentDTO() {

    }
    public StudentDTO(Student student) {
        this.nombre = student.getNombre();
        this.apellidos = student.getApellidos();
        this.Cedula = student.getCedula();
        this.edad = student.getEdad();
        this.materia = student.getMateria();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
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
