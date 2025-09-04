package com.sena.getback.service;

import com.sena.getback.model.Productos;
import com.sena.getback.repository.IProductosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductosServiceImplement implements IProductosService {

    @Autowired
    private IProductosRepository productosRepository;

    @Override
    public Productos save(Productos producto) {
        return productosRepository.save(producto);
    }

    @Override
    public Optional<Productos> get(Integer id) {
        return productosRepository.findById(id);
    }

    @Override
    public void update(Productos producto) {
        productosRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productosRepository.deleteById(id);
    }

    @Override
    public Optional<Productos> findById(Integer id) {
        return productosRepository.findById(id);
    }

    @Override
    public Optional<Productos> findByNombre(String nombre) {
        return productosRepository.findByNombre(nombre);
    }

    @Override
    public List<Productos> findAll() {
        return productosRepository.findAll();
    }

    @Override
    public List<Productos> findByCategoriaId(Integer categoriaId) {
        return productosRepository.findByCategoriaId(categoriaId);
    }

    @Override
    public List<Productos> findByDisponibleTrue() {
        return productosRepository.findByDisponibleTrue();
    }

  
    }
