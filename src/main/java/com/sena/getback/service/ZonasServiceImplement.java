package com.sena.getback.service;

import com.sena.getback.model.Zonas;
import com.sena.getback.repository.IZonasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ZonasServiceImplement implements IZonasService {

	@Autowired
	private IZonasRepository zonasRepository;

	@Override
	public Zonas save(Zonas zona) {
		return zonasRepository.save(zona);
	}

	@Override
	public Optional<Zonas> get(Integer id) {
		return zonasRepository.findById(id);
	}

	@Override
	public void update(Zonas zona) {
		zonasRepository.save(zona);
	}

	@Override
	public void delete(Integer id) {
		zonasRepository.deleteById(id);
	}

	@Override
	public Optional<Zonas> findById(Integer id) {
		return zonasRepository.findById(id);
	}

	@Override
	public List<Zonas> findAll() {
		return zonasRepository.findAll();
	}

	@Override
	public List<Zonas> findByNombreContaining(String nombre) {
		return zonasRepository.findByNombreContaining(nombre);
	}
}