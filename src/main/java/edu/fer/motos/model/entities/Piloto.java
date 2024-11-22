package edu.fer.motos.model.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.fer.motos.model.enums.Conduccion;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 25)
    private String nombre;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "Enum('PASIVA','AGRESIVA','TEMERARIA')")
    private Conduccion conduccion;
    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    List<Carrera> carreras = new ArrayList<>();

    public Piloto() {
    }

    public Piloto(Integer id, String nombre, Conduccion conduccion, List<Carrera> carreras) {
        this.id = id;
        this.nombre = nombre;
        this.conduccion = conduccion;
        this.carreras = carreras;
    }

    public Piloto(String nombre, Conduccion conduccion, List<Carrera> carreras) {
        this.nombre = nombre;
        this.conduccion = conduccion;
        this.carreras = carreras;
    }
    

    public Piloto(Integer id, String nombre, Conduccion conduccion) {
        this.id = id;
        this.nombre = nombre;
        this.conduccion = conduccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Conduccion getConduccion() {
        return conduccion;
    }

    public void setConduccion(Conduccion conduccion) {
        this.conduccion = conduccion;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

}
