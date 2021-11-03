package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.DevisRequestDTO;
import com.iticsolution.smartfacturation.dto.DevisResponseDTO;
import com.iticsolution.smartfacturation.entities.Devis;

@Mapper(componentModel = "spring")
public interface DevisMapper {
	
	Devis fromDevisRequestDTO(DevisRequestDTO devisRequestDTO);
	DevisResponseDTO fromDevis(Devis devis);

}
