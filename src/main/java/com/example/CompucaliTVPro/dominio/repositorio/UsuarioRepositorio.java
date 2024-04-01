package com.example.CompucaliTVPro.dominio.repositorio;

import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    public Usuario findByCorreo(String email);

}
