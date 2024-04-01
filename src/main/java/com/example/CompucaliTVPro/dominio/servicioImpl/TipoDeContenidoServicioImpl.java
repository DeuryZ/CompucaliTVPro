package com.example.CompucaliTVPro.dominio.servicioImpl;

import com.example.CompucaliTVPro.dominio.repositorio.TipoDeContenidoRepositorio;
import com.example.CompucaliTVPro.dominio.servicio.TipoDeContenidoServicio;
import com.example.CompucaliTVPro.persistencia.DTO.TipoDeContenidoDTO;
import com.example.CompucaliTVPro.persistencia.entidad.TipoDeContenido;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDeContenidoServicioImpl implements TipoDeContenidoServicio {

    private final TipoDeContenidoRepositorio tipoDeContenidoRepositorio;

    public TipoDeContenidoServicioImpl(TipoDeContenidoRepositorio tipoDeContenidoRepositorio){
        this.tipoDeContenidoRepositorio = tipoDeContenidoRepositorio;
    }

    @Override
    public List<TipoDeContenidoDTO> obtenerTodosLosTiposDeContenidos() {
        List<TipoDeContenido> tipoDeContenidos = tipoDeContenidoRepositorio.findAll();
        List<TipoDeContenidoDTO> tipoDeContenidoDTOS = new ArrayList<>();
        tipoDeContenidos.forEach(
                tipoDeContenido -> tipoDeContenidoDTOS.add(TipoDeContenidoDTO.toDTO(tipoDeContenido))
        );
        return tipoDeContenidoDTOS;
    }

    @Override
    public TipoDeContenidoDTO obtenerTipoDeContenidoPorId(int id) {
        return tipoDeContenidoRepositorio.findById(Long.valueOf(id)).map(TipoDeContenidoDTO::toDTO).orElse(null);
    }

    @Override
    public TipoDeContenidoDTO agregarTipoDeContenido(TipoDeContenido tipoDeContenido) {
        TipoDeContenido tipoDeContenidoGuardado = tipoDeContenidoRepositorio.save(tipoDeContenido);
        return TipoDeContenidoDTO.toDTO(tipoDeContenidoGuardado);
    }

}
