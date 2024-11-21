package edu.fer.motos.model.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuitos")
public class Circuito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 25,nullable = false)
    private String nombre;
    @Column(length = 25, nullable = false)
    private String localidad;
    @OneToMany(mappedBy = "circuito",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    List<Carrera> carreras= new ArrayList<>();

}
