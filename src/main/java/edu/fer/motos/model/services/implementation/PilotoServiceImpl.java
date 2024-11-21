package edu.fer.motos.model.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.repositories.IPilotoRepository;
import edu.fer.motos.model.services.interfaces.IPilotoService;

@Service
public class PilotoServiceImpl implements IPilotoService {
    @Autowired
    IPilotoRepository pilotoRepository;

    @Override
    public List<Piloto> buscarTodos() {
        return pilotoRepository.findAll();
    }

    @Override
    public Piloto buscarPiloto(Integer id) {
        Optional<Piloto> optPiloto = pilotoRepository.findById(id);
        if (optPiloto.isPresent()) {
            return optPiloto.get();

        } else {
            return null;
        }
    }

    @Override
    public Piloto crearPiloto(Piloto piloto) {
        if (piloto != null && piloto.getId() != null) {
            return pilotoRepository.save(piloto);
        } else {
            return null;
        }
    }

}
