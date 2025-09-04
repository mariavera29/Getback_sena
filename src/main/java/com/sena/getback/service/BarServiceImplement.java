package com.sena.getback.service;

import com.sena.getback.model.Bar;
import com.sena.getback.repository.IBarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BarServiceImplement implements IBarService {

    @Autowired
    private IBarRepository barRepository;

    @Override
    public Bar save(Bar bar) {
        return barRepository.save(bar);
    }

    @Override
    public Optional<Bar> get(Integer id) {
        return barRepository.findById(id);
    }

    @Override
    public void update(Bar bar) {
        barRepository.save(bar);
    }

    @Override
    public void delete(Integer id) {
        barRepository.deleteById(id);
    }

    @Override
    public Optional<Bar> findById(Integer id) {
        return barRepository.findById(id);
    }

    @Override
    public List<Bar> findAll() {
        return barRepository.findAll();
    }

    @Override
    public List<Bar> findByProductoId(Integer productoId) {
        return barRepository.findByProductoId(productoId);
    }

    @Override
    public List<Bar> findByTipoMovimiento(String tipoMovimiento) {
        return barRepository.findByTipoMovimiento(tipoMovimiento);
    }
}