package edu.fer.motos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fer.motos.model.dto.CircuitoDTO;
import edu.fer.motos.model.entities.Circuito;
import edu.fer.motos.model.services.implementation.CircuitoServiceImpl;

@RestController
@RequestMapping("/circuitos")
public class CircuitoController {
    @Autowired
    CircuitoServiceImpl circuitoService;

    @GetMapping("/all")
    public ResponseEntity<List<Circuito>> buscarTodos() {
        try {
            List<Circuito> circuitos = circuitoService.buscarTodos();
            return ResponseEntity.ok(circuitos);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }

    @GetMapping("/circuito/{id}")
    public ResponseEntity<Circuito> buscarCircuitoPorId(@PathVariable Integer id) {
        try {
            Circuito circuito = circuitoService.buscarPorId(id);
            return circuito != null ? ResponseEntity.status(HttpStatus.OK).body(circuito)
                    : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Circuito> buscarCircuitoPorNombre(@PathVariable("nombre") String nombre) {
        Circuito circuito = circuitoService.buscarPorNombre(nombre);
        return circuito != null ? ResponseEntity.ok().body(circuito) : ResponseEntity.badRequest().build();
    }

    @GetMapping("/nombre2/{nombre}")
    public ResponseEntity<CircuitoDTO> buscarCircuitoPorNombre2(@PathVariable("nombre") String nombre) {
        CircuitoDTO circuito = circuitoService.buscarPorNombre2(nombre);
        return circuito != null ? ResponseEntity.ok().body(circuito) : ResponseEntity.badRequest().build();
    }
    

}
