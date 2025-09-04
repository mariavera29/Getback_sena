package com.sena.getback.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.getback.model.Rol;
import com.sena.getback.repository.IRolRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    @Override
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Optional<Rol> get(Integer id) {
        return rolRepository.findById(id);
    }

    @Override
    public void update(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }

    @Override
    public Optional<Rol> findById(Integer id) {
        return rolRepository.findById(id);
    }

    @Override
    public Optional<Rol> findByNombre(String nombre) {
        return rolRepository.findByNombre(nombre);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
}