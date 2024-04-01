package com.example.CompucaliTVPro.persistencia.entidad;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EstadoDeVisualizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadoDeVisualizacion;

    @OneToMany(mappedBy = "estadoDeVisualizacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenido> contenidosEstado = new ArrayList<>();

    public EstadoDeVisualizacion() {
    }

    public EstadoDeVisualizacion(int idEstadoDeVisualizacion, List<Contenido> contenidos) {
        this.idEstadoDeVisualizacion = idEstadoDeVisualizacion;
        this.contenidosEstado = contenidos;
    }

    public int getIdEstadoDeVisualizacion() {
        return idEstadoDeVisualizacion;
    }

    public void setIdEstadoDeVisualizacion(int idEstadoDeVisualizacion) {
        this.idEstadoDeVisualizacion = idEstadoDeVisualizacion;
    }

    public List<Contenido> getContenidosEstado() {
        return contenidosEstado;
    }

    public void setContenidosEstado(List<Contenido> contenidosEstado) {
        this.contenidosEstado = contenidosEstado;
    }
}
