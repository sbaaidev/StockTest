package com.iticsolution.smartfacturation.dto;

import java.time.Instant;
import java.util.List;

import com.iticsolution.smartfacturation.entities.LigneBonService;
import com.iticsolution.smartfacturation.entities.LigneDevis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class BonServiceRequestDTO {
	private Long id;
	private String codeBS;
	private Instant dateBonService ;
	private String modeReglement ;
	private String numCheque ;
	private String numEffet;
	private String observBS;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
}
