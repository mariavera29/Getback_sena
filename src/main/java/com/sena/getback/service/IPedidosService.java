package com.sena.getback.service;


import java.util.List;
import java.util.Optional;
import com.sena.getback.model.Pedido;

public interface IPedidosService {
    Pedido save(Pedido pedido);
    Optional<Pedido> get(Integer id);
    void update(Pedido pedido);
    void delete(Integer id);
    Optional<Pedido> findById(Integer id);
    List<Pedido> findAll();
    List<Pedido> findByMesaId(Integer mesaId);
    List<Pedido> findByUsuarioId(Integer usuarioId);
    List<Pedido> findByEstadoId(Integer estadoId);
}