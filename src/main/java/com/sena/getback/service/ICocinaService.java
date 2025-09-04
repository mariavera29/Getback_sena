package com.sena.getback.service;

import com.sena.getback.model.Cocina;
import java.util.List;
import java.util.Optional;

public interface ICocinaService {
    Cocina save(Cocina cocina);
    Optional<Cocina> get(Integer id);
    void update(Cocina cocina);
    void delete(Integer id);
    Optional<Cocina> findById(Integer id);
    List<Cocina> findAll();
    List<Cocina> findByProductoId(Integer productoId);
    List<Cocina> findByTipoMovimiento(String tipoMovimiento);
}