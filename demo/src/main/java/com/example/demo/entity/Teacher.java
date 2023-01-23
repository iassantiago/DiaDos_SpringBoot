package com.example.demo.entity;

import com.example.demo.dto.TeacherDTO;
import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String nombres;
    private String apellidos;
    private int cedula;
    private int edad;
    private String materia;

    public Teacher(Integer id, String nombres, String apellidos, int cedula, int edad, String materia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }

    public Teacher(){}

    public Teacher(TeacherDTO teacher) {
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
