package com.example.CompucaliTVPro.dominio.servicio;

import com.example.CompucaliTVPro.persistencia.entidad.Usuario;

import java.util.List;

public interface UsuarioServicio {
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario findById(int id);
    Usuario save(Usuario usuario);
    void delete(int id);
}
