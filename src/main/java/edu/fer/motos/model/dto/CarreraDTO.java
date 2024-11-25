package edu.fer.motos.model.dto;

import edu.fer.motos.model.enums.Posicion;

public class CarreraDTO {
    private Long id;
    private Posicion posicion;
    private PilotoDTO piloto;

    public CarreraDTO() {
    }

    public CarreraDTO(Long id, PilotoDTO piloto, Posicion posicion) {
        this.id = id;
        this.piloto = piloto;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PilotoDTO getPiloto() {
        return piloto;
    }

    public void setPiloto(PilotoDTO piloto) {
        this.piloto = piloto;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
}