package com.iticsolution.smartfacturation.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor @AllArgsConstructor
public class FactureRequestDTO {
	private Long id;
	private String numFacture;
	private Instant dateFacture ;
	private String modeReglement ;
	private String numCheque ;
	private String numEffet;
	private String observFacture;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
}
