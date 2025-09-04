package com.sena.getback.repository;

import com.sena.getback.model.CuentaCocina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ICuentaCocinaRepository extends JpaRepository<CuentaCocina, Integer> {
    
    List<CuentaCocina> findByUsuarioId(Integer usuarioId);
    
    List<CuentaCocina> findByPedidoId(Integer pedidoId);
}