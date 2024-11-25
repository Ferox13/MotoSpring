package edu.fer.motos.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.fer.motos.model.dto.CircuitoDTO;
import edu.fer.motos.model.entities.Circuito;

@Mapper
public interface CircuitoMapper {
    CircuitoMapper INSTANCE = Mappers.getMapper(CircuitoMapper.class);

    CircuitoDTO toDTO(Circuito circuito);
    Circuito toEntity(CircuitoDTO circuitoDTO);
}
