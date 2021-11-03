package com.iticsolution.smartfacturation.dto;

import javax.persistence.ManyToOne;

import com.iticsolution.smartfacturation.entities.Article;
import com.iticsolution.smartfacturation.entities.Devis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class LigneDevisResponseDTO {
	private Long id;
	private int quantite;
	private double tauxTVA;
	private double mtHT;
	private double mtTVA;
	private double mtTTC;
	private Devis devis;
	private Article article ;
}
