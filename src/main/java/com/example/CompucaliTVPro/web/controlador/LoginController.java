package com.example.CompucaliTVPro.web.controlador;

import com.example.CompucaliTVPro.dominio.repositorio.UsuarioRepositorio;
import com.example.CompucaliTVPro.dominio.seguridad.JWTAuthtenticationConfig;
import com.example.CompucaliTVPro.persistencia.entidad.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Login resources")
public class LoginController {

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
            @RequestParam("email") String email,
            @RequestParam("password") String password) {

        Usuario admin = adminRepository.findByCorreo(email);

        if (admin != null && admin.getContrasenia().equals(password)) {
            String token = jwtAuthtenticationConfig.getJWTToken(email);
            adminRepository.save(admin);
            return token;
        } else {
            throw new RuntimeException("Invalid Information");
        }
    }
}
