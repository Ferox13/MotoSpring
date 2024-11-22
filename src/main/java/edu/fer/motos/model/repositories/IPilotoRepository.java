package edu.fer.motos.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.enums.Posicion;

public interface IPilotoRepository extends JpaRepository<Piloto, Integer> {
     @Query("SELECT p, COUNT(v) as victorias FROM Piloto p JOIN p.carreras v WHERE v.posicion = :primero GROUP BY p ORDER BY victorias DESC")
    List<Piloto> findPilotoConMasPosicion(@Param("primero") Posicion primero);
}
