package com.sena.getback.repository;

import com.sena.getback.model.CategoriasProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ICategoriasProductoRepository extends JpaRepository<CategoriasProducto, Integer> {
    
    Optional<CategoriasProducto> findByNombre(String nombre);
    
    List<CategoriasProducto> findByTipoCategoria(String tipoCategoria);
    
    List<CategoriasProducto> findByNombreContaining(String nombre);
    
    boolean existsByNombre(String nombre);
}