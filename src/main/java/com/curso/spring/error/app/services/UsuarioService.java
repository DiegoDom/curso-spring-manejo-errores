package com.curso.spring.error.app.services;

import java.util.List;
import java.util.Optional;

import com.curso.spring.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
