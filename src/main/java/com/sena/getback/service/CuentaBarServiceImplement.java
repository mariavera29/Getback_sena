package com.sena.getback.service;

import com.sena.getback.model.CuentaBar;
import com.sena.getback.repository.ICuentaBarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaBarServiceImplement implements ICuentaBarService {

    @Autowired
    private ICuentaBarRepository cuentaBarRepository;

    @Override
    public CuentaBar save(CuentaBar cuentaBar) {
        return cuentaBarRepository.save(cuentaBar);
    }

    @Override
    public Optional<CuentaBar> get(Integer id) {
        return cuentaBarRepository.findById(id);
    }

    @Override
    public void update(CuentaBar cuentaBar) {
        cuentaBarRepository.save(cuentaBar);
    }

    @Override
    public void delete(Integer id) {
        cuentaBarRepository.deleteById(id);
    }

    @Override
    public Optional<CuentaBar> findById(Integer id) {
        return cuentaBarRepository.findById(id);
    }

    @Override
    public List<CuentaBar> findAll() {
        return cuentaBarRepository.findAll();
    }

    @Override
    public List<CuentaBar> findByUsuarioId(Integer usuarioId) {
        return cuentaBarRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<CuentaBar> findByPedidoId(Integer pedidoId) {
        return cuentaBarRepository.findByPedidoId(pedidoId);
    }
}