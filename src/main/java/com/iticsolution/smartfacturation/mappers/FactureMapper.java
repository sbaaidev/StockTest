package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.FactureRequestDTO;
import com.iticsolution.smartfacturation.dto.FactureResponseDTO;
import com.iticsolution.smartfacturation.entities.Facture;

@Mapper(componentModel = "spring")
public interface FactureMapper {
	
	Facture fromFactureRequestDTO(FactureRequestDTO factureRequestDTO);
	FactureResponseDTO fromFacture(Facture facture);

}
