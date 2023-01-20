package com.example.demo.entity;

import com.example.demo.dto.StudentDTO;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(nullable = false)
    private  String nombre;
    private  String apellidos;
    private int Cedula;
    private int edad;
    private String materia;

    public Student(String nombre, String apellidos, int cedula, int edad, String materia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        Cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }
    public Student() {
    }

    public Student(StudentDTO student) {
        this.nombre = student.getNombre();
        this.apellidos = student.getApellidos();
        Cedula = student.getCedula();
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
