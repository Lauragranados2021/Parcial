package com.Parcial.Parcial.model;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.io.Serializable;
@Entity
public class Estudiante implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
@Column(nullable = false,name="nombre")
    public String nombre;
@Column(nullable = false,name="apellido")
    public String apellido;

    public Estudiante() {
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
}
