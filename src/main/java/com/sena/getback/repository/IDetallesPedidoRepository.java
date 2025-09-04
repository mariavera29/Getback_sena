package com.sena.getback.repository;

import com.sena.getback.model.DetallesPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IDetallesPedidoRepository extends JpaRepository<DetallesPedido, Integer> {
    
    List<DetallesPedido> findByPedidoId(Integer pedidoId);
    
    List<DetallesPedido> findByProductoId(Integer productoId);
    
    List<DetallesPedido> findByPedidoIdAndProductoId(Integer pedidoId, Integer productoId);
}