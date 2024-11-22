package edu.fer.motos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.entities.Piloto;
import edu.fer.motos.model.enums.Posicion;
import edu.fer.motos.model.services.implementation.PilotoServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public ResponseEntity<Piloto> buscarPilotoPorId(@PathVariable Integer id) {
        try {
            Piloto piloto = pilotoService.buscarPiloto(id);
            return piloto != null ? ResponseEntity.ok().body(piloto) : ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/piloto")
    public ResponseEntity<Piloto> crearPiloto(@RequestBody Piloto piloto) {
        try {

            Piloto pilotoInsert = pilotoService.crearPiloto(piloto);
            return pilotoInsert != null ? ResponseEntity.ok().body(pilotoInsert) : ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();

        }

    }

    @GetMapping("/posicion/{posuno}/{posdos}")
    public ResponseEntity<List<Piloto>> buscarPilotosEntrePosiciones(@PathVariable("posuno") Posicion posuno,
            @PathVariable("posdos") Posicion posdos) {
        List<Piloto> pilotos = pilotoService.pilotosPodium(posuno, posdos);
        return !pilotos.isEmpty() ? ResponseEntity.ok().body(pilotos) : ResponseEntity.noContent().build();

    }

    @GetMapping("/posicion/carrera/{posuno}/{posdos}")
    public ResponseEntity<List<Piloto>> buscarPilotosCarreraEntrePosiciones(@PathVariable("posuno") Posicion posuno,
            @PathVariable("posdos") Posicion posdos) {
        List<Piloto> pilotos = pilotoService.pilotosPodiumCarrera(posuno, posdos);
        return !pilotos.isEmpty() ? ResponseEntity.ok().body(pilotos) : ResponseEntity.noContent().build();

    }

    @GetMapping("/victorias")
    public ResponseEntity<Piloto> buscarPilotoMasVicotrias() {
        try {
            Piloto piloto = pilotoService.buscarPilotoMaxVictorias();
            return piloto != null ? ResponseEntity.ok().body(piloto) : ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    

}
