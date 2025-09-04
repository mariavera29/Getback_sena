package com.sena.getback.service;

import com.sena.getback.model.DetallesPedido;

import com.sena.getback.repository.IDetallesPedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DetallesPedidoServiceImplement implements IDetallesPedidoService {

    @Autowired
    private IDetallesPedidoRepository detallesPedidoRepository;

    @Override
    public DetallesPedido save(DetallesPedido detalle) {
        return detallesPedidoRepository.save(detalle);
    }

    @Override
    public Optional<DetallesPedido> get(Integer id) {
        return detallesPedidoRepository.findById(id);
    }

    @Override
    public void update(DetallesPedido detalle) {
        detallesPedidoRepository.save(detalle);
    }

    @Override
    public void delete(Integer id) {
        detallesPedidoRepository.deleteById(id);
    }

    @Override
    public Optional<DetallesPedido> findById(Integer id) {
        return detallesPedidoRepository.findById(id);
    }

    @Override
    public List<DetallesPedido> findAll() {
        return detallesPedidoRepository.findAll();
    }

    @Override
    public List<DetallesPedido> findByPedidoId(Integer pedidoId) {
        return detallesPedidoRepository.findByPedidoId(pedidoId);
    }

    @Override
    public List<DetallesPedido> findByProductoId(Integer productoId) {
        return detallesPedidoRepository.findByProductoId(productoId);
    }
}