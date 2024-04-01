package com.example.CompucaliTVPro.dominio.repositorio;

import com.example.CompucaliTVPro.persistencia.entidad.Contenido;
import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContenidoRepositorio extends JpaRepository<Contenido, Long> {
    @Query("SELECT c.idContenido FROM Contenido c JOIN c.usuarios u WHERE u.id_usuario = :usuario")
    List<Object> obtenerTodosMisContenidos(@Param("usuario") int usuario);
}
