package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.BonServiceRequestDTO;
import com.iticsolution.smartfacturation.dto.BonServiceResponseDTO;
import com.iticsolution.smartfacturation.entities.BonService;

@Mapper(componentModel = "spring")
public interface BonServiceMapper {
	BonService fromBonServiceRequestDTO(BonServiceRequestDTO bonServiceRequestDTO);
	BonServiceResponseDTO fromBonService(BonService bonservice);
}
