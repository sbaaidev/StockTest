package com.iticsolution.smartfacturation.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iticsolution.smartfacturation.entities.LigneBonService;
import com.iticsolution.smartfacturation.entities.LigneDevis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ArticleResponseDTO {
	private Long id;
	private String refArt;
	private String designation;
	private String typeArt;
	private double prixUnitHT;
	private double tauxTVA;
	private List<LigneBonService> ligneBonService;
	private List<LigneDevis> ligneDevis;
	
}
