package com.iticsolution.smartfacturation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class LigneBonServiceRequestDTO {
	private Long id;
	private int quantite ;
	private double tauxTVA;
	private double mtHT;
	private double mtTVA;
	private double mtTTC;
}
