package edu.fer.motos.model.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fer.motos.model.entities.Circuito;
import edu.fer.motos.model.repositories.ICircuitoRepository;
import edu.fer.motos.model.services.interfaces.ICircuitoService;

@Service
public class CircuitoServiceImpl implements ICircuitoService {
    @Autowired
    ICircuitoRepository circuitoRepository;

    @Override
    public List<Circuito> buscarTodos() {
        return circuitoRepository.findAll();

        
    }

    @Override
    public Circuito buscarPorId(Integer id) {
        Optional<Circuito> optCircuito=circuitoRepository.findById(id);
        if(optCircuito.isPresent()){
            return optCircuito.get();
        }else{
            return null;
        }
    }
    @Override
    public Circuito buscarPorNombre(String nombre) {
        Optional<Circuito> optCircuito = circuitoRepository.findByNombre(nombre);
        return optCircuito.isPresent() ? optCircuito.get() : null;

    }

}
