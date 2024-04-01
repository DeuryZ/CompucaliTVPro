package com.example.CompucaliTVPro.dominio.servicioImpl;

import com.example.CompucaliTVPro.dominio.repositorio.ContenidoRepositorio;
import com.example.CompucaliTVPro.dominio.servicio.ContenidoServicio;
import com.example.CompucaliTVPro.persistencia.DTO.ContenidoDTO;
import com.example.CompucaliTVPro.persistencia.entidad.Contenido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ContenidoServicioImpl implements ContenidoServicio {

    private final ContenidoRepositorio contenidoRepositorio;

    public ContenidoServicioImpl(ContenidoRepositorio contenidoRepositorio){
        this.contenidoRepositorio = contenidoRepositorio;
    }

    @Override
    public List<ContenidoDTO> obtenerTodosMisContenidos(int usuarioId) {
        List<Contenido> contenidos = contenidoRepositorio.obtenerTodosMisContenidos(usuarioId);
        List<ContenidoDTO> contenidoDTOS = new ArrayList<>();
        contenidos.forEach(
                contenido -> contenidoDTOS.add(ContenidoDTO.toDTO(contenido))
        );
        return contenidoDTOS;
    }

    @Override
    public ContenidoDTO obtenerContenidoPorId(int id) {
        return null;
    }

    @Override
    public ContenidoDTO eliminarContenido(int id) {
        return null;
    }

    @Override
    public ContenidoDTO actualizarContenido(int id, Contenido contenido) {
        return null;
    }

    @Override
    public ContenidoDTO agregarContenido(Contenido contenido) {
        return null;
    }
}
