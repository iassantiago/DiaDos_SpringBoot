package com.example.demo.dto;

import com.example.demo.entity.Student;

import java.time.LocalDate;
import java.util.Date;

public class StudentDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private LocalDate birthdate;
    private int cedula;
    private int edad;
    private String materia;

    public StudentDTO(Integer id, String nombres, String apellidos, LocalDate birthdate, int cedula, int edad, String materia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.birthdate= birthdate;
        this.cedula = cedula;
        this.edad = edad;
        this.materia = materia;
    }
    public StudentDTO() {

    }
    public StudentDTO(Student student) {
        this.id = student.getId();
        this.nombres = student.getNombres();
        this.apellidos = student.getApellidos();
        this.birthdate=student.getBirthdate();
        this.cedula = student.getCedula();
        this.edad = student.getEdad();
        this.materia = student.getMateria();

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

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        cedula = cedula;
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
