package edu.fer.motos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fer.motos.model.entities.Circuito;
import edu.fer.motos.model.repositories.ICircuitoRepository;
import edu.fer.motos.model.services.implementation.CircuitoServiceImpl;
import edu.fer.motos.model.services.interfaces.ICircuitoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    

}
