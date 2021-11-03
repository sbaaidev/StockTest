package com.iticsolution.smartfacturation.dto;

import java.time.Instant;

import javax.persistence.ManyToOne;

import com.iticsolution.smartfacturation.entities.BonService;
import com.iticsolution.smartfacturation.entities.Facture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ReglementClientResponseDTO {
	private Long id;
	private Instant dateRegelement;
	private double montantTTC;
	private double solde;
	private double credit;
	private double debit ; 
	private double totalDebit;
	private double totalSolde;
	private String modeRegelement;
	private String numCheque;
	private String numEffet;
	private Facture facture;
	private BonService bonService;
}
