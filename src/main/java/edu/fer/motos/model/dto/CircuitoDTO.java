package edu.fer.motos.model.dto;

import java.util.List;

import edu.fer.motos.model.entities.Carrera;
import edu.fer.motos.model.entities.Piloto;

public class CircuitoDTO {
    private Integer id;
    private String nombre;
    private String localidad;
    private List<CarreraDTO> carreras;
    public CircuitoDTO() {
    }
    public CircuitoDTO(Integer id, String nombre, String localidad, List<CarreraDTO> carreras) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.carreras = carreras;
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
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public List<CarreraDTO> getCarreras() {
        return carreras;
    }
    public void setCarreras(List<CarreraDTO> carreras) {
        this.carreras = carreras;
    }
    
}
