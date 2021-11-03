package com.iticsolution.smartfacturation.dto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.iticsolution.smartfacturation.entities.BonService;
import com.iticsolution.smartfacturation.entities.ReglementClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class FactureResponseDTO {
	private Long id;
	private String numFacture;
	private Instant dateFacture ;
	private String modeReglement ;
	private String numCheque ;
	private String numEffet;
	private String observFacture;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
	private List<BonService> bonService;
	private List<ReglementClient> reglement;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
    

    
}
