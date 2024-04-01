package com.example.CompucaliTVPro.web.controlador;

import com.example.CompucaliTVPro.dominio.repositorio.UsuarioRepositorio;
import com.example.CompucaliTVPro.dominio.seguridad.JWTAuthtenticationConfig;
import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.example.CompucaliTVPro.dominio.servicioImpl.UsuarioServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    private JWTAuthtenticationConfig jwtAuthtenticationConfig;

    @Autowired
    private UsuarioRepositorio adminRepository;

//    @Autowired
//    private GlobalExceptionHandler globalExceptionHandler;

    @Operation(summary = "Login For the application")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/login")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public String login(
            @RequestParam("correo") String correo,
            @RequestParam("contrasenia") String contrasenia) {


        Usuario admin = adminRepository.findByCorreo(correo);

        if (admin != null && admin.getContrasenia().equals(contrasenia)) {
            String token = jwtAuthtenticationConfig.getJWTToken(correo);
            adminRepository.save(admin);
            return token;
        } else {
            throw new RuntimeException("Invalid Information");
        }
    }













    private final UsuarioServiceImpl usuarioServicio;

    public UsuarioControlador(UsuarioServiceImpl usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/obtenerTodosLosUsuarios")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioServicio.obtenerTodosLosUsuarios();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioServicio.save(usuario);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    @DeleteMapping("/{id}")
    public void delete(int id) {
        usuarioServicio.delete(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/{id}")
    public Usuario findById(int id) {
        return usuarioServicio.findById(id);
    }

}
