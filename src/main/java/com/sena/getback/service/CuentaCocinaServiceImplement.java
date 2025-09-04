package com.sena.getback.service;

import com.sena.getback.model.CuentaCocina;
import com.sena.getback.repository.ICuentaCocinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaCocinaServiceImplement implements ICuentaCocinaService {

    @Autowired
    private ICuentaCocinaRepository cuentaCocinaRepository;

    @Override
    public CuentaCocina save(CuentaCocina cuentaCocina) {
        return cuentaCocinaRepository.save(cuentaCocina);
    }

    @Override
    public Optional<CuentaCocina> get(Integer id) {
        return cuentaCocinaRepository.findById(id);
    }

    @Override
    public void update(CuentaCocina cuentaCocina) {
        cuentaCocinaRepository.save(cuentaCocina);
    }

    @Override
    public void delete(Integer id) {
        cuentaCocinaRepository.deleteById(id);
    }

    @Override
    public Optional<CuentaCocina> findById(Integer id) {
        return cuentaCocinaRepository.findById(id);
    }

    @Override
    public List<CuentaCocina> findAll() {
        return cuentaCocinaRepository.findAll();
    }

    @Override
    public List<CuentaCocina> findByUsuarioId(Integer usuarioId) {
        return cuentaCocinaRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<CuentaCocina> findByPedidoId(Integer pedidoId) {
        return cuentaCocinaRepository.findByPedidoId(pedidoId);
    }
}