package com.example.CompucaliTVPro.web.controlador;

import com.example.CompucaliTVPro.dominio.servicioImpl.TipoDeContenidoServicioImpl;
import com.example.CompucaliTVPro.persistencia.DTO.TipoDeContenidoDTO;
import com.example.CompucaliTVPro.persistencia.entidad.TipoDeContenido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposDeContenidos")
public class TipoDeContenidoControlador {

    private final TipoDeContenidoServicioImpl tipoDeContenidoServicio;

    public TipoDeContenidoControlador(TipoDeContenidoServicioImpl tipoDeContenidoServicio){
        this.tipoDeContenidoServicio = tipoDeContenidoServicio;
    }

    @GetMapping
    public ResponseEntity<List<TipoDeContenidoDTO>> obtenerTodosLosTiposDeContenidos(){
        return ResponseEntity.ok(tipoDeContenidoServicio.obtenerTodosLosTiposDeContenidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDeContenidoDTO> obtenerTipoDeContenidoPorId(@PathVariable int id){
        return ResponseEntity.ok(tipoDeContenidoServicio.obtenerTipoDeContenidoPorId(id));
    }

    @PostMapping("/agregar")
    public ResponseEntity<TipoDeContenidoDTO> agregarTipoDeContenido(@RequestBody TipoDeContenido tipoDeContenido){
        return ResponseEntity.ok(tipoDeContenidoServicio.agregarTipoDeContenido(tipoDeContenido));
    }
}
