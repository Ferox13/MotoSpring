package edu.fer.motos.model.entities;

import org.hibernate.annotations.Collate;

import edu.fer.motos.model.enums.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 25,nullable = false)
    private String temporada;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Posicion posicion;
    @ManyToOne
    @JoinColumn(name = "piloto_id", referencedColumnName = "id")
    private Piloto piloto;
    @ManyToOne
    @JoinColumn(name = "circuito_id", referencedColumnName = "id")
    private Circuito circuito;

}
