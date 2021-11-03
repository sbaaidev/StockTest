package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.LigneDevisRequestDTO;
import com.iticsolution.smartfacturation.dto.LigneDevisResponseDTO;
import com.iticsolution.smartfacturation.entities.LigneDevis;

@Mapper(componentModel = "spring")
public interface LigneDevisMapper {
	
	LigneDevis fromLigneDevisRequestDTO(LigneDevisRequestDTO ligneDevisRequestDTO);
	LigneDevisResponseDTO fromLigneDevis(LigneDevis ligneDevis);

}
