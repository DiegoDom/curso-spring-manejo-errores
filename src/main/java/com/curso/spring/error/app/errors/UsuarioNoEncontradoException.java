package com.curso.spring.error.app.errors;

public class UsuarioNoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String id) {

		super("El id: ".concat(id).concat(" no pertenece a ningún usuario registrado en el sistema"));

	}

}
