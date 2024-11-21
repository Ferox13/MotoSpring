package edu.fer.motos.model.services.interfaces;

import java.util.List;

import edu.fer.motos.model.entities.Carrera;

public interface ICarreraService {
    List<Carrera> buscarTodo();
    Carrera buscarPorId(Integer id);

}
