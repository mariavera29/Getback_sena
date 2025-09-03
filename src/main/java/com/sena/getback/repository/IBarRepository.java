package com.sena.getback.repository;

import com.sena.getback.model.Bar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IBarRepository extends JpaRepository<Bar, Integer> {
    
    List<Bar> findByProductoId(Integer productoId);
    
    List<Bar> findByTipoMovimiento(String tipoMovimiento);
}