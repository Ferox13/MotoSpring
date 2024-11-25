package edu.fer.motos.model.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fer.motos.model.dto.CircuitoDTO;
import edu.fer.motos.model.entities.Circuito;
import edu.fer.motos.model.mappers.CircuitoMapper;
import edu.fer.motos.model.repositories.ICircuitoRepository;
import edu.fer.motos.model.services.interfaces.ICircuitoService;

@Service
public class CircuitoServiceImpl implements ICircuitoService {
    @Autowired
    private ICircuitoRepository circuitoRepository;

    @Override
    public List<Circuito> buscarTodos() {
        return circuitoRepository.findAll();

    }

    @Override
    public Circuito buscarPorId(Integer id) {
        Optional<Circuito> optCircuito = circuitoRepository.findById(id);
        if (optCircuito.isPresent()) {
            Circuito circuito = optCircuito.get();
            // Cargar las carreras asociadas
            circuito.getCarreras().size(); // Esto fuerza la carga de las carreras
            return circuito;
        } else {
            return null;
        }
    }

    @Override
    public Circuito buscarPorNombre(String nombre) {
        Optional<Circuito> optCircuito = circuitoRepository.findByNombre(nombre);
        if (optCircuito.isPresent()) {
            Circuito circuito = optCircuito.get();
            // Cargar las carreras asociadas
            circuito.getCarreras().size(); // Esto fuerza la carga de las carreras
            return circuito;
        } else {
            return null;
        }
    }

    @Override
    public CircuitoDTO buscarPorNombre2(String nombre) {
        Optional<Circuito> optCircuito = circuitoRepository.findByNombre(nombre);
        if (optCircuito.isPresent()) {
            Circuito circuito = optCircuito.get();
            // Cargar las carreras asociadas
            circuito.getCarreras().size(); // Esto fuerza la carga de las carreras
            CircuitoDTO dto= CircuitoMapper.INSTANCE.toDTO(circuito);
            return dto;
        } else {
            return null;
        }

    }

}
