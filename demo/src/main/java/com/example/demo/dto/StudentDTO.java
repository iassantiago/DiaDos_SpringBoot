package com.example.demo.dto;

import com.example.demo.entity.Student;

import java.util.Date;

public class StudentDTO {
    private Integer id;
    private  String nombre;
    private  String apellidos;
    private Date birthdate;
    private int cedula;
    private int edad;
    private String materia;

    public StudentDTO(Integer id,String nombre, String apellidos,Date birthdate, int cedula, int edad, String materia) {
        this.id = id;
        this.nombre = nombre;
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
        this.nombre = student.getNombre();
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

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
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
