package com.sena.getback.service;

import com.sena.getback.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
	Usuario save(Usuario usuario);

	Optional<Usuario> get(Integer id);

	void update(Usuario usuario);

	void delete(Integer id);

	Optional<Usuario> findById(Integer id);

	Optional<Usuario> findByEmail(String email);

	List<Usuario> findAll();

	Optional<Usuario> findByUsername(String username);
}