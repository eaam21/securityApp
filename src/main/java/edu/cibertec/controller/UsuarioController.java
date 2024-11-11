package edu.cibertec.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@GetMapping("/home")
	@PreAuthorize("hasRole('ROLE_LOGISTICA') or hasRole('ROLE_ADMIN')")
	public String homeUsuario() {
		return "Bienvenido Usuario Logística";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String homeAdmin() {
		return "Bienvenido Administrador";
	}
}
