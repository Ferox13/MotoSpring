package edu.fer.motos.model.services.interfaces;

import java.util.List;

import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.enums.Posicion;

public interface IPilotoService {
 List<Piloto> buscarTodos();
 Piloto buscarPiloto(Integer id);
 Piloto crearPiloto(Piloto piloto);
 List<Piloto> pilotosPodium(Posicion posuno,Posicion posdos);
 List<Piloto> pilotosPodiumCarrera(Posicion posuno,Posicion posdos);
 Piloto buscarPilotoMaxVictorias();
}
