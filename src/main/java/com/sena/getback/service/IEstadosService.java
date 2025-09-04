package com.sena.getback.service;

import com.sena.getback.model.Estados;
import java.util.List;
import java.util.Optional;

public interface IEstadosService {
    Estados save(Estados estado);
    Optional<Estados> get(Integer id);
    void update(Estados estado);
    void delete(Integer id);
    Optional<Estados> findById(Integer id);
    Optional<Estados> findByNombre(String nombre);
    List<Estados> findAll();
    List<Estados> findByTipoEstado(String tipoEstado);
    List<Estados> findByNombreContaining(String nombre);
    boolean existsByNombre(String nombre);
}