package com.sena.getback.service;

import com.sena.getback.model.Eventos;
import java.util.List;
import java.util.Optional;

public interface IEventosService {
    Eventos save(Eventos evento);
    Optional<Eventos> get(Integer id);
    void update(Eventos evento);
    void delete(Integer id);
    Optional<Eventos> findById(Integer id);
    List<Eventos> findAll();
    List<Eventos> findByEstadoId(Integer estadoId);
    List<Eventos> findByNombreContaining(String nombre);
}