package dev.frexus.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.frexus.crud.entity.TiendaEntity;
import dev.frexus.crud.repository.TiendaRepository;

@Service
public class TiendaService {

    private final TiendaRepository tiendaRepository;

    public TiendaService(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    public TiendaEntity save(TiendaEntity tienda) {
        return tiendaRepository.save(tienda);
    }

    public void deleteById(Integer id) {
        tiendaRepository.deleteById(id);
    }

    public List<TiendaEntity> findAll() {
        return tiendaRepository.findAll();
    }

    public TiendaEntity findById(Integer id) {
        return tiendaRepository.findById(id).orElse(null);
    }
}
