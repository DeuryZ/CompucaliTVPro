package com.example.CompucaliTVPro.dominio.servicio;

import com.example.CompucaliTVPro.dominio.repositorio.ContenidoRepositorio;
import com.example.CompucaliTVPro.persistencia.DTO.ContenidoDTO;
import com.example.CompucaliTVPro.persistencia.entidad.Contenido;
import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContenidoServicio {
    List<ContenidoDTO> obtenerTodosMisContenidos(int usuario);
    ContenidoDTO obtenerContenidoPorId(int id);
    ContenidoDTO eliminarContenido(int id);
    ContenidoDTO actualizarContenido(int id, Contenido contenido);
    ContenidoDTO agregarContenido(Contenido contenido);

}
