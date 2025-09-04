package com.sena.getback.repository;

import com.sena.getback.model.CuentaBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ICuentaBarRepository extends JpaRepository<CuentaBar, Integer> {
    
    List<CuentaBar> findByUsuarioId(Integer usuarioId);
    
    List<CuentaBar> findByPedidoId(Integer pedidoId);
}