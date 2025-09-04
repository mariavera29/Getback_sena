package com.sena.getback.repository;

import com.sena.getback.model.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IEventosRepository extends JpaRepository<Eventos, Integer> {
    
    List<Eventos> findByEstadoId(Integer estadoId);
    
    List<Eventos> findByNombreContaining(String nombre);
}