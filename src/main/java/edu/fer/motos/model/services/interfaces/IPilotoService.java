package edu.fer.motos.model.services.interfaces;

import java.util.List;

import edu.fer.motos.model.entities.Piloto;

public interface IPilotoService {
 List<Piloto> buscarTodos();
 Piloto buscarPiloto(Integer id);
 Piloto crearPiloto(Piloto piloto);
}
