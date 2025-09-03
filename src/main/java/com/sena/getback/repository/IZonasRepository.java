package com.sena.getback.repository;

import com.sena.getback.model.Zonas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IZonasRepository extends JpaRepository<Zonas, Integer> {
    
    List<Zonas> findByNombreContaining(String nombre);
}