package com.Parcial.Parcial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Practica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
    @Column(nullable = false,name="destino")
    public String destino;
    @Column(nullable = false,name="inicio")
    public Date inicio;
    @Column(nullable = false,name="fin")
    public Date fin;
    @ManyToOne
    @JoinColumn(nullable = false)
    public Empresa empresa;
    @OneToMany(mappedBy = "practica",cascade = CascadeType.REMOVE)
    @JsonIgnore
    public List<Estudiante> estudiantes;
    @ManyToOne
    @JoinColumn(nullable = false)
    public Docente docente;
    @OneToMany(mappedBy = "practica",cascade = CascadeType.REMOVE)
    @JsonIgnore
    public List<curso> cursos;


    public Practica() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Practica setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        return this;
    }

    public Date getInicio() {
        return inicio;
    }

    public Practica setInicio(Date inicio) {
        this.inicio = inicio;
        return this;
    }

    public Date getFin() {
        return fin;
    }

    public Practica setFin(Date fin) {
        this.fin = fin;
        return this;
    }

    public Docente getDocente() {
        return docente;
    }

    public Practica setDocente(Docente docente) {
        this.docente = docente;
        return this;
    }

    public List<curso> getCursos() {
        return cursos;
    }

    public Practica setCursos(List<curso> cursos) {
        this.cursos = cursos;
        return this;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }



    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
