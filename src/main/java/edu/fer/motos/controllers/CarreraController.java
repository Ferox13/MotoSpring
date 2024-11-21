package edu.fer.motos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.services.implementation.CarreraServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/carrera")
public class CarreraController {
    @Autowired
    CarreraServiceImpl carreraService;

    @GetMapping("/all")
    public ResponseEntity<List<Carrera>> buscarTodo() {
        List<Carrera> carreras = carreraService.buscarTodo();
        return !carreras.isEmpty() ? ResponseEntity.ok().body(carreras) : ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrera> buscarCarreraPorId(@PathVariable Integer id) {
        Carrera carrera = carreraService.buscarPorId(id);
        return carrera != null ? ResponseEntity.ok().body(carrera) : ResponseEntity.badRequest().build();
    }
    
   

}
