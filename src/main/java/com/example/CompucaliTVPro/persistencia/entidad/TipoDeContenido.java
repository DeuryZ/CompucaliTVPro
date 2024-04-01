package com.example.CompucaliTVPro.persistencia.entidad;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TipoDeContenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTipoContenido;

    private String nombreTipoContenido;

    @OneToMany(mappedBy = "tipoDeContenido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenido> contenidosTipo = new ArrayList<>();

    public TipoDeContenido() {
    }

    public TipoDeContenido(int idTipoContenido, String nombreTipoContenido, List<Contenido> contenidos) {
        IdTipoContenido = idTipoContenido;
        this.nombreTipoContenido = nombreTipoContenido;
        this.contenidosTipo = contenidos;
    }

    public int getIdTipoContenido() {
        return IdTipoContenido;
    }

    public void setIdTipoContenido(int idTipoContenido) {
        IdTipoContenido = idTipoContenido;
    }

    public String getNombreTipoContenido() {
        return nombreTipoContenido;
    }

    public void setNombreTipoContenido(String nombreTipoContenido) {
        this.nombreTipoContenido = nombreTipoContenido;
    }

    public List<Contenido> getContenidosTipo() {
        return contenidosTipo;
    }

    public void setContenidosTipo(List<Contenido> contenidosTipo) {
        this.contenidosTipo = contenidosTipo;
    }
}
