package com.example.CompucaliTVPro.persistencia.entidad;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;

    private String nombreGenero;

    @ManyToMany(mappedBy = "generos")
    private Set<Contenido> contenidos = new HashSet<>();

    public Genero() {
    }

    public Genero(int idGenero, String nombreGenero, Set<Contenido> contenidos) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.contenidos = contenidos;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public Set<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(Set<Contenido> contenidos) {
        this.contenidos = contenidos;
    }
}
