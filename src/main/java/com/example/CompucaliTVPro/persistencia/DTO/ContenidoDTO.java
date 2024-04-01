package com.example.CompucaliTVPro.persistencia.DTO;

import com.example.CompucaliTVPro.persistencia.entidad.*;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class ContenidoDTO {
    private int idContenido;
    private Set<Usuario> usuarios = new HashSet<>();
    private String nombre;
    private TipoDeContenido tipoDeContenido;
    private EstadoDeVisualizacion estadoDeVisualizacion;
    private Plataforma plataforma;
    private Set<Genero> generos = new HashSet<>();
    private double calificacion;
    private String comentario;

    public ContenidoDTO() {
    }

    public ContenidoDTO(int idContenido, Set<Usuario> usuarios, String nombre, TipoDeContenido tipoDeContenido, EstadoDeVisualizacion estadoDeVisualizacion, Plataforma plataforma, Set<Genero> generos, double calificacion, String comentario) {
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

    public static ContenidoDTO toDTO(Contenido contenido){
        ContenidoDTO contenidoDTO = new ContenidoDTO();

        contenidoDTO.setCalificacion(contenido.getCalificacion());
        contenidoDTO.setComentario(contenido.getComentario());
        contenidoDTO.setIdContenido(contenido.getIdContenido());
        contenidoDTO.setGeneros(contenido.getGeneros());
        contenidoDTO.setTipoDeContenido(contenido.getTipoDeContenido());
        contenidoDTO.setPlataforma(contenido.getPlataforma());
        contenidoDTO.setNombre(contenido.getNombre());
        contenidoDTO.setEstadoDeVisualizacion(contenido.getEstadoDeVisualizacion());
        contenidoDTO.setUsuarios(contenido.getUsuarios());

        return contenidoDTO;
    }

    public static Contenido toEntity(ContenidoDTO contenido){
        Contenido contenidoDTO = new Contenido();

        contenidoDTO.setCalificacion(contenido.getCalificacion());
        contenidoDTO.setComentario(contenido.getComentario());
        contenidoDTO.setIdContenido(contenido.getIdContenido());
        contenidoDTO.setGeneros(contenido.getGeneros());
        contenidoDTO.setTipoDeContenido(contenido.getTipoDeContenido());
        contenidoDTO.setPlataforma(contenido.getPlataforma());
        contenidoDTO.setNombre(contenido.getNombre());
        contenidoDTO.setEstadoDeVisualizacion(contenido.getEstadoDeVisualizacion());
        contenidoDTO.setUsuarios(contenido.getUsuarios());

        return contenidoDTO;
    }
}
