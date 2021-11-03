package com.iticsolution.smartfacturation.mappers;

import org.mapstruct.Mapper;

import com.iticsolution.smartfacturation.dto.ClientRequestDTO;
import com.iticsolution.smartfacturation.dto.ClientResponseDTO;
import com.iticsolution.smartfacturation.entities.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {
	Client fromClientRequestDTO(ClientRequestDTO clientRequestDTO);
	ClientResponseDTO fromClient(Client client);

}
