package com.iticsolution.smartfacturation.dto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.iticsolution.smartfacturation.entities.Client;
import com.iticsolution.smartfacturation.entities.Facture;
import com.iticsolution.smartfacturation.entities.LigneBonService;
import com.iticsolution.smartfacturation.entities.LigneDevis;
import com.iticsolution.smartfacturation.entities.ReglementClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class BonServiceResponseDTO {
	private Long id;
	private String codeBS;
	private Instant dateBonService ;
	private String modeReglement ;
	private String numCheque ;
	private String numEffet;
	private String observBS;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
	private Facture facture;
	private Client client;
	List<LigneBonService> ligneBonService;
	private List<ReglementClient> reglement;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
    
}
