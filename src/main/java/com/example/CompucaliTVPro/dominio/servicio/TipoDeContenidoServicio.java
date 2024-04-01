package com.example.CompucaliTVPro.dominio.servicio;

import com.example.CompucaliTVPro.persistencia.DTO.TipoDeContenidoDTO;
import com.example.CompucaliTVPro.persistencia.entidad.TipoDeContenido;

import java.util.List;

public interface TipoDeContenidoServicio {
    List<TipoDeContenidoDTO> obtenerTodosLosTiposDeContenidos();
    TipoDeContenidoDTO obtenerTipoDeContenidoPorId(int id);
    TipoDeContenidoDTO agregarTipoDeContenido(TipoDeContenido tipoDeContenido);

}
