package com.sena.getback.service;

import java.util.List;
import java.util.Optional;

import com.sena.getback.model.Rol;

public interface IRolService {
	Rol save(Rol rol);

	Optional<Rol> get(Integer id);

	void update(Rol rol);

	void delete(Integer id);

	Optional<Rol> findById(Integer id);

	Optional<Rol> findByNombre(String nombre);

	List<Rol> findAll();
}