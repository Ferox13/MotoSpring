package edu.fer.motos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.services.implementation.PilotoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pilotos")
public class PilotoController {
    @Autowired
    PilotoServiceImpl pilotoService;

    @GetMapping("/all")
    public ResponseEntity<List<Piloto>> buscarTodos() {
        try {
            List<Piloto> pilotos = pilotoService.buscarTodos();
            return !pilotos.isEmpty() ? ResponseEntity.ok().body(pilotos) : ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/piloto/{id}")
    public ResponseEntity<Piloto> getMethodName(@RequestParam Integer id) {
        try {
            Piloto piloto = pilotoService.buscarPiloto(id);
            return piloto != null ? ResponseEntity.ok().body(piloto) : ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/piloto")
    public ResponseEntity<Piloto> crerPiloto(@RequestBody Piloto piloto) {
        try {

            Piloto pilotoInsert = pilotoService.crearPiloto(piloto);
            return pilotoInsert != null ? ResponseEntity.ok().body(pilotoInsert) : ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();

        }

    }

}
