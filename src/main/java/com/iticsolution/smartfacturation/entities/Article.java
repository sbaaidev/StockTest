package com.iticsolution.smartfacturation.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String refArt;
	private String designation;
	private String typeArt;
	private double prixUnitHT;
	private double tauxTVA;
	@JsonIgnore
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
	private List<LigneBonService> ligneBonService;
	@JsonIgnore
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
	private List<LigneDevis> ligneDevis;



}
