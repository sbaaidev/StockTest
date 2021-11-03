package com.iticsolution.smartfacturation.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ArticleRequestDTO {
	private Long id;
	private String refArt;
	private String designation;
	private String typeArt;
	private double prixUnitHT;
	private double tauxTVA;
}
