package com.Parcial.Parcial.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, name="nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Docente docente;
   @ManyToOne
   @JoinColumn(nullable = false)
    private Practica practica;



    public curso() {
    }


    public curso(Integer id, String nombre, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
    }

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }




}