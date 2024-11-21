package edu.fer.motos.model.services.interfaces;

import java.util.List;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.enums.Posicion;

public interface ICarreraService {
    List<Carrera> buscarTodo();
    Carrera buscarPorId(Integer id);
    List<Carrera> buscarPilotosEntrePosiciones(Posicion posicionUno, Posicion posicionDos);

}
