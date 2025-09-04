package com.sena.getback.service;

import com.sena.getback.model.CuentaCocina;
import java.util.List;
import java.util.Optional;

public interface ICuentaCocinaService {
    CuentaCocina save(CuentaCocina cuentaCocina);
    Optional<CuentaCocina> get(Integer id);
    void update(CuentaCocina cuentaCocina);
    void delete(Integer id);
    Optional<CuentaCocina> findById(Integer id);
    List<CuentaCocina> findAll();
    List<CuentaCocina> findByUsuarioId(Integer usuarioId);
    List<CuentaCocina> findByPedidoId(Integer pedidoId);
}