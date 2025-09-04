package com.sena.getback.service;

import com.sena.getback.model.Eventos;
import com.sena.getback.repository.IEventosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventosServiceImplement implements IEventosService {

    @Autowired
    private IEventosRepository eventosRepository;

    @Override
    public Eventos save(Eventos evento) {
        return eventosRepository.save(evento);
    }

    @Override
    public Optional<Eventos> get(Integer id) {
        return eventosRepository.findById(id);
    }

    @Override
    public void update(Eventos evento) {
        eventosRepository.save(evento);
    }

    @Override
    public void delete(Integer id) {
        eventosRepository.deleteById(id);
    }

    @Override
    public Optional<Eventos> findById(Integer id) {
        return eventosRepository.findById(id);
    }

    @Override
    public List<Eventos> findAll() {
        return eventosRepository.findAll();
    }

    @Override
    public List<Eventos> findByEstadoId(Integer estadoId) {
        return eventosRepository.findByEstadoId(estadoId);
    }

    @Override
    public List<Eventos> findByNombreContaining(String nombre) {
        return eventosRepository.findByNombreContaining(nombre);
    }
}