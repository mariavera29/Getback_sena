package com.sena.getback.repository;

import com.sena.getback.model.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface IEstadosRepository extends JpaRepository<Estados, Integer> {
    
    Optional<Estados> findByNombre(String nombre);
    
    List<Estados> findByTipoEstado(String tipoEstado);
    
    List<Estados> findByNombreContaining(String nombre);
    
    boolean existsByNombre(String nombre);
}