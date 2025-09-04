package com.sena.getback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.getback.model.Usuario;
import com.sena.getback.repository.IUsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuariosRepository;

	@Override
	public Usuario save(Usuario usuario) {
		return usuariosRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		return usuariosRepository.findById(id);
	}

	@Override
	public void update(Usuario usuario) {
		usuariosRepository.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		usuariosRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuariosRepository.findById(id);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuariosRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuariosRepository.findAll();
	}

	@Override
	public Optional<Usuario> findByUsername(String username) {
		return usuariosRepository.findByUsername(username);
	}
}