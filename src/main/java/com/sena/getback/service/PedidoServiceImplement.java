package com.sena.getback.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.getback.model.Pedido;
import com.sena.getback.repository.IPedidosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImplement implements IPedidosService {

    @Autowired
    private IPedidosRepository pedidosRepository;

    @Override
    public Pedido save(Pedido pedido) {
        return pedidosRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> get(Integer id) {
        return pedidosRepository.findById(id);
    }

    @Override
    public void update(Pedido pedido) {
        pedidosRepository.save(pedido);
    }

    @Override
    public void delete(Integer id) {
        pedidosRepository.deleteById(id);
    }

    @Override
    public Optional<Pedido> findById(Integer id) {
        return pedidosRepository.findById(id);
    }

    @Override
    public List<Pedido> findAll() {
        return pedidosRepository.findAll();
    }

    @Override
    public List<Pedido> findByMesaId(Integer mesaId) {
        return pedidosRepository.findByMesaId(mesaId);
    }

    @Override
    public List<Pedido> findByUsuarioId(Integer usuarioId) {
        return pedidosRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Pedido> findByEstadoId(Integer estadoId) {
        return pedidosRepository.findByEstadoId(estadoId);
    }
}