package com.Parcial.Parcial.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Practica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;
    @Column(nullable = false,name="destino")
    public String destino;
    @Column(nullable = false,name="fecha")
    public String fecha;
    @Column(nullable = false,name="Periodo")
    public String Periodo;
    @ManyToOne
    @JoinColumn(nullable = false)
    public Empresa empresa;


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

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
