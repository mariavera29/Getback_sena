package com.sena.getback.service;

import com.sena.getback.model.Estados;
import com.sena.getback.repository.IEstadosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstadosServiceImplement implements IEstadosService {

    @Autowired
    private IEstadosRepository estadosRepository;

    @Override
    public Estados save(Estados estado) {
        return estadosRepository.save(estado);
    }

    @Override
    public Optional<Estados> get(Integer id) {
        return estadosRepository.findById(id);
    }

    @Override
    public void update(Estados estado) {
        estadosRepository.save(estado);
    }

    @Override
    public void delete(Integer id) {
        estadosRepository.deleteById(id);
    }

    @Override
    public Optional<Estados> findById(Integer id) {
        return estadosRepository.findById(id);
    }

    @Override
    public Optional<Estados> findByNombre(String nombre) {
        return estadosRepository.findByNombre(nombre);
    }

    @Override
    public List<Estados> findAll() {
        return estadosRepository.findAll();
    }

    @Override
    public List<Estados> findByTipoEstado(String tipoEstado) {
        return estadosRepository.findByTipoEstado(tipoEstado);
    }

    @Override
    public List<Estados> findByNombreContaining(String nombre) {
        return estadosRepository.findByNombreContaining(nombre);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return estadosRepository.existsByNombre(nombre);
    }
}