package edu.fer.motos.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.ReportingPolicy;

import edu.fer.motos.model.dto.CircuitoDTO;
import edu.fer.motos.model.entities.Circuito;

@Mapper(uses = CarreraMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CircuitoMapper {
    CircuitoMapper INSTANCE = Mappers.getMapper(CircuitoMapper.class);

    CircuitoDTO toDTO(Circuito circuito);
    Circuito toEntity(CircuitoDTO circuitoDTO);
}
