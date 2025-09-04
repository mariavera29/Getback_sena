package com.sena.getback.repository;

import com.sena.getback.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface IProductosRepository extends JpaRepository<Productos, Integer> {
    
    Optional<Productos> findByNombre(String nombre);
    
    List<Productos> findByCategoriaId(Integer categoriaId);
    
    List<Productos> findByDisponibleTrue();
    
    List<Productos> findByPrecioBetween(Double precioMin, Double precioMax);
    
    List<Productos> findByNombreContaining(String nombre);
    
    List<Productos> findByCategoriaTipoCategoria(String tipoCategoria);
    
    List<Productos> findByCategoriaTipoCategoriaAndDisponibleTrue(String tipoCategoria);
    
    boolean existsByNombre(String nombre);
}