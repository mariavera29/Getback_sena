package com.sena.getback.service;

import com.sena.getback.model.Cocina;
import com.sena.getback.repository.ICocinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CocinaServiceImplement implements ICocinaService {

    @Autowired
    private ICocinaRepository cocinaRepository;

    @Override
    public Cocina save(Cocina cocina) {
        return cocinaRepository.save(cocina);
    }

    @Override
    public Optional<Cocina> get(Integer id) {
        return cocinaRepository.findById(id);
    }

    @Override
    public void update(Cocina cocina) {
        cocinaRepository.save(cocina);
    }

    @Override
    public void delete(Integer id) {
        cocinaRepository.deleteById(id);
    }

    @Override
    public Optional<Cocina> findById(Integer id) {
        return cocinaRepository.findById(id);
    }

    @Override
    public List<Cocina> findAll() {
        return cocinaRepository.findAll();
    }

    @Override
    public List<Cocina> findByProductoId(Integer productoId) {
        return cocinaRepository.findByProductoId(productoId);
    }

    @Override
    public List<Cocina> findByTipoMovimiento(String tipoMovimiento) {
        return cocinaRepository.findByTipoMovimiento(tipoMovimiento);
    }
}