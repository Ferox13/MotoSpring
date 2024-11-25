package edu.fer.motos.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.fer.motos.model.dto.PilotoDTO;
import edu.fer.motos.model.entities.Piloto;

@Mapper
public interface PilotoMapper {
    PilotoMapper INSTANCE = Mappers.getMapper(PilotoMapper.class);

    PilotoDTO toDTO(Piloto piloto);

    Piloto toEntity(PilotoDTO pilotoDTO);
}
