package edu.fer.motos.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import edu.fer.motos.model.dto.CarreraDTO;
import edu.fer.motos.model.entities.Carrera;

@Mapper(uses = PilotoMapper.class)
public interface CarreraMapper {
    CarreraMapper INSTANCE = Mappers.getMapper(CarreraMapper.class);

    // @Mapping(target = "circuito", ignore = true)
    CarreraDTO toDTO(Carrera carrera);
    Carrera toEntity(CarreraDTO carreraDTO);
}
