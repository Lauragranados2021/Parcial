package com.Parcial.Parcial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
    @Column(nullable = false,name="nombre")
    public String nombre;
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.REMOVE)
    @JsonIgnore
    public List<Practica> practicas;

    public Empresa() {
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

    public List<Practica> getPracticas() {
        return practicas;
    }

    public void setPracticas(List<Practica> practicas) {
        this.practicas = practicas;
    }
}
