package edu.fer.motos.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fer.motos.model.entities.Carrera;

public interface ICarreraRepository extends JpaRepository<Carrera,Integer> {

}
