package com.sena.getback.service;

import com.sena.getback.model.CuentaBar;
import java.util.List;
import java.util.Optional;

public interface ICuentaBarService {
    CuentaBar save(CuentaBar cuentaBar);
    Optional<CuentaBar> get(Integer id);
    void update(CuentaBar cuentaBar);
    void delete(Integer id);
    Optional<CuentaBar> findById(Integer id);
    List<CuentaBar> findAll();
    List<CuentaBar> findByUsuarioId(Integer usuarioId);
    List<CuentaBar> findByPedidoId(Integer pedidoId);
}