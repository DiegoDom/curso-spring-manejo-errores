package com.curso.spring.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.spring.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImp() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario(1, "Diego", "Dominguez"));
		lista.add(new Usuario(2, "John", "Doe"));
		lista.add(new Usuario(3, "Jean", "Doe"));
		lista.add(new Usuario(4, "Chris", "Doe"));
		lista.add(new Usuario(5, "Carl", "Doe"));
		lista.add(new Usuario(6, "Luis", "Doe"));
		lista.add(new Usuario(7, "Larry", "Doe"));

	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;

		for (Usuario un_usuario : this.lista) {
			if (un_usuario.getId().equals(id)) {
				resultado = un_usuario;
				break;
			}
		}

		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
