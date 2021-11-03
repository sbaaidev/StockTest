package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.ReglementClientRequestDTO;
import com.iticsolution.smartfacturation.dto.ReglementClientResponseDTO;
import com.iticsolution.smartfacturation.entities.ReglementClient;

@Mapper(componentModel = "spring")
public interface ReglementClientMapper {
	
	ReglementClient fromReglementClientRequestDTO(ReglementClientRequestDTO reglementClientRequestDTO);
	ReglementClientResponseDTO fromReglementClient(ReglementClient reglementClient);

}
