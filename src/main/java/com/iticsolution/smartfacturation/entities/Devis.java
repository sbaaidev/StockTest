package com.iticsolution.smartfacturation.entities;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDevis;
	@Column(unique = true)
	private String numDevis;
	private Instant dateDevis;
	private String observDevis;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
	@ManyToOne
	private Client client;
	//@JsonIgnore
	@OneToMany(mappedBy = "devis")
	private List<LigneDevis> ligneDevis;
	
	@CreationTimestamp
    private LocalDateTime createDateTime;
 
    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}

