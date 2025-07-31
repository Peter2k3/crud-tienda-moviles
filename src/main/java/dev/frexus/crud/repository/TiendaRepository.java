package dev.frexus.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.frexus.crud.entity.TiendaEntity;

@Repository
public interface TiendaRepository extends JpaRepository<TiendaEntity, Integer> {
}
