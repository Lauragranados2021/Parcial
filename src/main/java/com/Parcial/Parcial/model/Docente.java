package com.Parcial.Parcial.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Set;


@Entity
public class Docente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, name="nombre")
    private String nombre;

    @Column(nullable = false, name = "apellido")
    private String apellido;

    @Column(nullable = false, name = "NumIdentificacion")
    private String NumIdentificacion;

    @OneToMany(mappedBy = "docente",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<curso> cursos;
    @OneToMany(mappedBy = "docente",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Practica> practicas;

    public List<curso> getCursos() {
        return cursos;
    }

    public Docente setCursos(List<curso> cursos) {
        this.cursos = cursos;
        return this;
    }

    public List<Practica> getPracticas() {
        return practicas;
    }

    public Docente setPracticas(List<Practica> practicas) {
        this.practicas = practicas;
        return this;
    }

    public Docente(){

    }

    public Docente(Integer id, String nombre, String apellido, String numIdentificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        NumIdentificacion = numIdentificacion;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumIdentificacion() {
        return NumIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        NumIdentificacion = numIdentificacion;
    }


    @Override
    public String toString() {
        return "Docente{"+
                "id="+id+
                ",nombre='"+ nombre+'\'' +
                ", apellido='" + apellido + '\'' +
                ", NumIdentificacion='" + NumIdentificacion +
                '}';
    }
}