package com.example.demo.entity;

import com.example.demo.dto.TeacherDTO;
import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String nombre;
    private String apellidos;
    private int cedula;
    private int edad;
    private String materia;

    public Teacher(Integer id, String nombre, String apellidos, int cedula, int edad, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }

    public Teacher(){}

    public Teacher(TeacherDTO teacher) {
        this.nombre = teacher.getNombre();
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
