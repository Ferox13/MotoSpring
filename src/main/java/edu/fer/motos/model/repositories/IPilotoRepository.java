package edu.fer.motos.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fer.motos.model.entities.Piloto;

public interface IPilotoRepository extends JpaRepository<Piloto, Integer> {
}
