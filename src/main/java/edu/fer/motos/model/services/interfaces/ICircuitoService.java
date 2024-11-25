package edu.fer.motos.model.services.interfaces;

import java.util.List;

import edu.fer.motos.model.entities.Circuito;

public interface ICircuitoService {
    List<Circuito> buscarTodos();

    Circuito buscarPorId(Integer id);

    Circuito buscarPorNombre(String nombre);

}
