package com.sena.getback.service;

import com.sena.getback.model.Bar;
import java.util.List;
import java.util.Optional;

public interface IBarService {
    Bar save(Bar bar);
    Optional<Bar> get(Integer id);
    void update(Bar bar);
    void delete(Integer id);
    Optional<Bar> findById(Integer id);
    List<Bar> findAll();
    List<Bar> findByProductoId(Integer productoId);
    List<Bar> findByTipoMovimiento(String tipoMovimiento);
}