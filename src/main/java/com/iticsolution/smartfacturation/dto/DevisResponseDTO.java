package com.iticsolution.smartfacturation.dto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.iticsolution.smartfacturation.entities.Client;
import com.iticsolution.smartfacturation.entities.LigneDevis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor @AllArgsConstructor
public class DevisResponseDTO {
	private Long idDevis;
	private String numDevis;
	private Instant dateDevis;
	private String observDevis;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
	private Client client;
	private List<LigneDevis> ligneDevis;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
}
