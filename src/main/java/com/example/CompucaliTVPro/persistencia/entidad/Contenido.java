package com.example.CompucaliTVPro.persistencia.entidad;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usuario_contenido",
            joinColumns = @JoinColumn(name = "idContenido"),
            inverseJoinColumns = @JoinColumn(name = "idUsuario"))
    private Set<Usuario> usuarios = new HashSet<>();

    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenidosTipo")
    private TipoDeContenido tipoDeContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenidosEstado")
    private EstadoDeVisualizacion estadoDeVisualizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenidosPlataforma")
    private Plataforma plataforma;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "genero_contenido",
            joinColumns = @JoinColumn(name = "idContenido"),
            inverseJoinColumns = @JoinColumn(name = "idGenero"))
    private Set<Genero> generos = new HashSet<>();

    @Column(name = "calificacion", nullable = true)
    private double calificacion;
    private String comentario;


    public Contenido() {
    }

    public Contenido(int idContenido, Set<Usuario> usuarios, String nombre, TipoDeContenido tipoDeContenido, EstadoDeVisualizacion estadoDeVisualizacion, Plataforma plataforma, Set<Genero> generos, double calificacion, String comentario) {
        this.idContenido = idContenido;
        this.usuarios = usuarios;
        this.nombre = nombre;
        this.tipoDeContenido = tipoDeContenido;
        this.estadoDeVisualizacion = estadoDeVisualizacion;
        this.plataforma = plataforma;
        this.generos = generos;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeContenido getTipoDeContenido() {
        return tipoDeContenido;
    }

    public void setTipoDeContenido(TipoDeContenido tipoDeContenido) {
        this.tipoDeContenido = tipoDeContenido;
    }

    public EstadoDeVisualizacion getEstadoDeVisualizacion() {
        return estadoDeVisualizacion;
    }

    public void setEstadoDeVisualizacion(EstadoDeVisualizacion estadoDeVisualizacion) {
        this.estadoDeVisualizacion = estadoDeVisualizacion;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
