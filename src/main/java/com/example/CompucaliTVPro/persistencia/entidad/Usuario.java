package com.example.CompucaliTVPro.persistencia.entidad;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    private String nombre;
    private String segundo_nombre;
    private String apellido;
    private String segundo_apellido;
    private String correo;
    private String contrasenia;

    @ManyToMany(mappedBy = "usuarios", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Contenido> contenidos = new HashSet<>();


    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String correo, String contrasenia) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellido = apellido;
        this.segundo_apellido = segundo_apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
