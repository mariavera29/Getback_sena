package com.sena.getback.repository;

import com.sena.getback.model.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface IMesasRepository extends JpaRepository<Mesas, Integer> {
    
    Optional<Mesas> findByNumero(String numero);
    
    List<Mesas> findByZonaId(Integer zonaId);
    
    List<Mesas> findByEstadoMesa(String estadoMesa);
    
    List<Mesas> findByCapacidadGreaterThanEqual(Integer capacidad);
    
    boolean existsByNumero(String numero);
}