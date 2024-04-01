package com.example.CompucaliTVPro.dominio.servicioImpl;

import com.example.CompucaliTVPro.dominio.repositorio.UsuarioRepositorio;
import com.example.CompucaliTVPro.dominio.servicio.UsuarioServicio;
import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServiceImpl(UsuarioRepositorio usuarioRepositorio){
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario findById(int id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void delete(int id) {
        usuarioRepositorio.deleteById(id);
    }
}
