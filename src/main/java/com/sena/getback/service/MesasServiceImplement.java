package com.sena.getback.service;

import com.sena.getback.model.Mesas;
import com.sena.getback.repository.IMesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MesasServiceImplement implements IMesasService {

    @Autowired
    private IMesasRepository mesasRepository;

    @Override
    public Mesas save(Mesas mesa) {
        return mesasRepository.save(mesa);
    }

    @Override
    public Optional<Mesas> get(Integer id) {
        return mesasRepository.findById(id);
    }

    @Override
    public void update(Mesas mesa) {
        mesasRepository.save(mesa);
    }

    @Override
    public void delete(Integer id) {
        mesasRepository.deleteById(id);
    }

    @Override
    public Optional<Mesas> findById(Integer id) {
        return mesasRepository.findById(id);
    }

    @Override
    public Optional<Mesas> findByNumero(String numero) {
        return mesasRepository.findByNumero(numero);
    }

    @Override
    public List<Mesas> findAll() {
        return mesasRepository.findAll();
    }

    @Override
    public List<Mesas> findByZonaId(Integer zonaId) {
        return mesasRepository.findByZonaId(zonaId);
    }

    @Override
    public List<Mesas> findByEstadoMesa(String estadoMesa) {
        return mesasRepository.findByEstadoMesa(estadoMesa);
    }

    @Override
    public List<Mesas> findByCapacidadGreaterThanEqual(Integer capacidad) {
        return mesasRepository.findByCapacidadGreaterThanEqual(capacidad);
    }

    @Override
    public boolean existsByNumero(String numero) {
        return mesasRepository.existsByNumero(numero);
    }
}