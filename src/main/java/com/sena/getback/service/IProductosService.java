package com.sena.getback.service;

import com.sena.getback.model.Productos;
import java.util.List;
import java.util.Optional;

public interface IProductosService {
    Productos save(Productos producto);
    Optional<Productos> get(Integer id);
    void update(Productos producto);
    void delete(Integer id);
    Optional<Productos> findById(Integer id);
    Optional<Productos> findByNombre(String nombre);
    List<Productos> findAll();
    List<Productos> findByCategoriaId(Integer categoriaId);
    List<Productos> findByDisponibleTrue();
}