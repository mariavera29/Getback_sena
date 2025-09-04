package com.sena.getback.service;

import com.sena.getback.model.DetallesPedido;
import java.util.List;
import java.util.Optional;

public interface IDetallesPedidoService {
    DetallesPedido save(DetallesPedido detalle);
    Optional<DetallesPedido> get(Integer id);
    void update(DetallesPedido detalle);
    void delete(Integer id);
    Optional<DetallesPedido> findById(Integer id);
    List<DetallesPedido> findAll();
    List<DetallesPedido> findByPedidoId(Integer pedidoId);
    List<DetallesPedido> findByProductoId(Integer productoId);
}