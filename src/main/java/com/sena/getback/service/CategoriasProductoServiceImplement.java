package com.sena.getback.service;

import com.sena.getback.model.CategoriasProducto;
import com.sena.getback.repository.ICategoriasProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriasProductoServiceImplement implements ICategoriasProductoService {

    @Autowired
    private ICategoriasProductoRepository categoriasProductoRepository;

    @Override
    public CategoriasProducto save(CategoriasProducto categoria) {
        return categoriasProductoRepository.save(categoria);
    }

    @Override
    public Optional<CategoriasProducto> get(Integer id) {
        return categoriasProductoRepository.findById(id);
    }

    @Override
    public void update(CategoriasProducto categoria) {
        categoriasProductoRepository.save(categoria);
    }

    @Override
    public void delete(Integer id) {
        categoriasProductoRepository.deleteById(id);
    }

    @Override
    public Optional<CategoriasProducto> findById(Integer id) {
        return categoriasProductoRepository.findById(id);
    }

    @Override
    public Optional<CategoriasProducto> findByNombre(String nombre) {
        return categoriasProductoRepository.findByNombre(nombre);
    }

    @Override
    public List<CategoriasProducto> findAll() {
        return categoriasProductoRepository.findAll();
    }

    @Override
    public List<CategoriasProducto> findByTipoCategoria(String tipoCategoria) {
        return categoriasProductoRepository.findByTipoCategoria(tipoCategoria);
    }

    @Override
    public List<CategoriasProducto> findByNombreContaining(String nombre) {
        return categoriasProductoRepository.findByNombreContaining(nombre);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return categoriasProductoRepository.existsByNombre(nombre);
    }
}