package com.sena.getback.service;

import com.sena.getback.model.CategoriasProducto;
import java.util.List;
import java.util.Optional;

public interface ICategoriasProductoService {
    CategoriasProducto save(CategoriasProducto categoria);
    Optional<CategoriasProducto> get(Integer id);
    void update(CategoriasProducto categoria);
    void delete(Integer id);
    Optional<CategoriasProducto> findById(Integer id);
    Optional<CategoriasProducto> findByNombre(String nombre);
    List<CategoriasProducto> findAll();
    List<CategoriasProducto> findByTipoCategoria(String tipoCategoria);
    List<CategoriasProducto> findByNombreContaining(String nombre);
    boolean existsByNombre(String nombre);
}