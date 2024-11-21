package edu.fer.motos.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.enums.Posicion;

public interface ICarreraRepository extends JpaRepository<Carrera,Integer> {
    List<Carrera> findByPosicionBetween(Posicion posicionUno, Posicion posicionDos);

}
