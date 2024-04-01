package com.example.CompucaliTVPro.persistencia.entidad;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlataforma;

    private String nombrePlataforma;


    @OneToMany(mappedBy = "plataforma", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenido> contenidosPlataforma = new ArrayList<>();

    public Plataforma() {
    }

    public Plataforma(int idPlataforma, String nombrePlataforma, List<Contenido> contenidos) {
        this.idPlataforma = idPlataforma;
        this.nombrePlataforma = nombrePlataforma;
        this.contenidosPlataforma = contenidos;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public List<Contenido> getContenidosPlataforma() {
        return contenidosPlataforma;
    }

    public void setContenidosPlataforma(List<Contenido> contenidosPlataforma) {
        this.contenidosPlataforma = contenidosPlataforma;
    }
}
