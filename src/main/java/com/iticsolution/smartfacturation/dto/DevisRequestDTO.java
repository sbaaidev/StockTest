package com.iticsolution.smartfacturation.dto;

import java.time.Instant;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class DevisRequestDTO {
	private Long idDevis;
	private String numDevis;
	private Instant dateDevis;
	private String observDevis;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
}
