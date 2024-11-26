package edu.fer.motos.model.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.enums.Posicion;
import edu.fer.motos.model.repositories.ICarreraRepository;
import edu.fer.motos.model.repositories.IPilotoRepository;
import edu.fer.motos.model.services.interfaces.IPilotoService;
import jakarta.transaction.Transactional;

@Service
public class PilotoServiceImpl implements IPilotoService {
    @Autowired
    IPilotoRepository pilotoRepository;
    @Autowired
    ICarreraRepository carreraRepository;

    @Override
    public List<Piloto> buscarTodos() {
        List<Piloto> pilotos = pilotoRepository.findAll();
        for (Piloto piloto : pilotos) {
            piloto.setCarreras(piloto.getCarreras());
        }

        return pilotos;
    }

    @Transactional
    @Override
    public Piloto buscarPiloto(Integer id) {
        // Optional<Piloto> optPiloto = pilotoRepository.findById(id);
        // return optPiloto.isPresent() ? optPiloto.get() : null;
        
        Piloto piloto = pilotoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Piloto no encontrado"));
        // Inicializa las relaciones perezosas (carga la lista)
        piloto.getCarreras().forEach(carrera -> {
            carrera.getCircuito(); // Inicializa el artefacto
        });
        return piloto;
    }

    @Override
    public Piloto crearPiloto(Piloto piloto) {
        if (piloto != null && piloto.getId() != null) {
            return pilotoRepository.save(piloto);
        } else {
            return null;
        }
    }

    @Override
    public List<Piloto> pilotosPodium(Posicion posicionuno, Posicion posiciondos) {
        List<Carrera> carreras = carreraRepository.findByPosicionBetween(posicionuno, posiciondos);
        List<Piloto> pilotos = new ArrayList<>();
        for (Carrera carrera : carreras) {
            Piloto piloto = new Piloto(carrera.getPiloto().getId(), carrera.getPiloto().getNombre(),
                    carrera.getPiloto().getConduccion());
            pilotos.add(piloto);
        }
        return pilotos;

    }

    @Override
    public List<Piloto> pilotosPodiumCarrera(Posicion posuno, Posicion posdos) {
        List<Carrera> carreras = carreraRepository.findByPosicionBetween(posuno, posdos);
        List<Piloto> pilotos = new ArrayList<>();
        for (Carrera carrera : carreras) {
            Piloto piloto = carrera.getPiloto();
            pilotos.add(piloto);
        }
        return pilotos;

    }

    @Override
    public Piloto buscarPilotoMaxVictorias() {
        List<Piloto> pilotos = pilotoRepository.findPilotoConMasPosicion(Posicion.FIRST);
        Piloto piloto = pilotos.get(0);
        return piloto != null ? piloto : null;
    }

    @Override
    public void eliminarPilotoId(Integer id) {
        Optional<Piloto> optPiloto = pilotoRepository.findById(id);
        if (optPiloto.isPresent()) {
            pilotoRepository.deleteById(optPiloto.get().getId());
        }

    }

}
