package edu.fer.motos.model.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.enums.Posicion;
import edu.fer.motos.model.repositories.ICarreraRepository;
import edu.fer.motos.model.services.interfaces.ICarreraService;

@Service
public class CarreraServiceImpl implements ICarreraService {
    @Autowired
    ICarreraRepository carreraRepository;

    @Override
    public List<Carrera> buscarTodo() {
        return carreraRepository.findAll();
    }

    @Override
    public Carrera buscarPorId(Integer id) {
        Optional<Carrera> optCarrera = carreraRepository.findById(id);
        return optCarrera.isPresent() ? optCarrera.get() : null;
    }

    @Override
    public List<Carrera> buscarPilotosEntrePosiciones(Posicion posicionUno, Posicion posicionDos) {
        List<Carrera> lista = carreraRepository.findByPosicionBetween(posicionUno, posicionDos);
        System.out.println(lista);
        return lista;
    }

    

}
