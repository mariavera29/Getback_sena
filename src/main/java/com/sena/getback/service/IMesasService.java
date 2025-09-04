package com.sena.getback.service;

import com.sena.getback.model.Mesas;
import java.util.List;
import java.util.Optional;

public interface IMesasService {
    Mesas save(Mesas mesa);
    Optional<Mesas> get(Integer id);
    void update(Mesas mesa);
    void delete(Integer id);
    Optional<Mesas> findById(Integer id);
    Optional<Mesas> findByNumero(String numero);
    List<Mesas> findAll();
    List<Mesas> findByZonaId(Integer zonaId);
    List<Mesas> findByEstadoMesa(String estadoMesa);
    List<Mesas> findByCapacidadGreaterThanEqual(Integer capacidad);
    boolean existsByNumero(String numero);
}