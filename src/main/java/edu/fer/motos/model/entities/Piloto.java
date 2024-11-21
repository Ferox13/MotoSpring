package edu.fer.motos.model.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ValueGenerationType;

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
import jakarta.persistence.JoinColumn;
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
    @Column(nullable = false,columnDefinition = "Enum('PASIVA','AGRESIVA','TEMERARIA')")
    private Conduccion conduccion;
    @OneToMany(mappedBy = "piloto",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    List<Carrera> carreras= new ArrayList<>();
}
