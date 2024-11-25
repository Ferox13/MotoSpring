package edu.fer.motos.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fer.motos.model.entities.Circuito;

public interface ICircuitoRepository extends JpaRepository<Circuito,Integer> {
        Optional<Circuito> findByNombre(String nombre);
        


}
