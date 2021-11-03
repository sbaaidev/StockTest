package com.iticsolution.smartfacturation.dto;

import javax.persistence.ManyToOne;

import com.iticsolution.smartfacturation.entities.Article;
import com.iticsolution.smartfacturation.entities.BonService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class LigneBonServiceResponseDTO {
	private Long id;
	private int quantite ;
	private double tauxTVA;
	private double mtHT;
	private double mtTVA;
	private double mtTTC;
	private BonService bonService;
	private Article article ;
}
