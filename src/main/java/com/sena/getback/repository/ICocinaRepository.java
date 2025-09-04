package com.sena.getback.repository;

import com.sena.getback.model.Cocina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ICocinaRepository extends JpaRepository<Cocina, Integer> {
    
    List<Cocina> findByProductoId(Integer productoId);
    
    List<Cocina> findByTipoMovimiento(String tipoMovimiento);
}