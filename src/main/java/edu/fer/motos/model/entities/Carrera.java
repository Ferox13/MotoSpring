package edu.fer.motos.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.fer.motos.model.enums.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 25, nullable = false)
    private String temporada;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Posicion posicion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "piloto_id", referencedColumnName = "id")
    private Piloto piloto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "circuito_id", referencedColumnName = "id")
    private Circuito circuito;

    public Carrera() {
    }

    public Carrera(Integer id, String temporada, Posicion posicion, Piloto piloto, Circuito circuito) {
        this.id = id;
        this.temporada = temporada;
        this.posicion = posicion;
        this.piloto = piloto;
        this.circuito = circuito;
    }

    public Carrera(String temporada, Posicion posicion, Piloto piloto, Circuito circuito) {
        this.temporada = temporada;
        this.posicion = posicion;
        this.piloto = piloto;
        this.circuito = circuito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

}
