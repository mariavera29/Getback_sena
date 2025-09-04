package com.sena.getback.service;

import com.sena.getback.model.Zonas;
import java.util.List;
import java.util.Optional;

public interface IZonasService {
    Zonas save(Zonas zona);
    Optional<Zonas> get(Integer id);
    void update(Zonas zona);
    void delete(Integer id);
    Optional<Zonas> findById(Integer id);
    List<Zonas> findAll();
    List<Zonas> findByNombreContaining(String nombre);
}