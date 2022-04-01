package com.curso.spring.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.curso.spring.error.app.errors.UsuarioNoEncontradoException;
import com.curso.spring.error.app.models.domain.Usuario;
import com.curso.spring.error.app.services.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;

	@SuppressWarnings("unused")
	@GetMapping({ "", "/", "/index" })
	public String index() {

		Integer valor = 100 / 0;
		// Integer valor = Integer.parseInt("10x");
		return "index";
	}

	@GetMapping("/ver/{id}")
	public String verUsuario(@PathVariable Integer id, Model model) {
		
		// Usuario usuario = usuarioService.obtenerPorIdOptional(id);
		/*if (usuario == null) {
			throw new UsuarioNoEncontradoException(id.toString());
		}*/
		
		Usuario usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontradoException(id.toString()));
		
		model.addAttribute("titulo", "Detalle del usuario ".concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);
 
		return "ver";
	}

}
