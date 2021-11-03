package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.BonServiceRequestDTO;
import com.iticsolution.smartfacturation.dto.BonServiceResponseDTO;
import com.iticsolution.smartfacturation.entities.BonService;
import com.iticsolution.smartfacturation.entities.LigneBonService;

@Mapper(componentModel = "spring")
public interface LigneBonServiceMapper {

	LigneBonService fromLigneBonServiceRequestDTO(BonServiceRequestDTO bonServiceRequestDTO);
	BonServiceResponseDTO fromBonService(BonService bonService);
}
