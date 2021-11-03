package com.iticsolution.smartfacturation.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="RegelementCLT")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReglementClient  implements Serializable{
	@Id @GeneratedValue
	private Long id;
	@ManyToOne
	private Facture facture;
	@ManyToOne
	private BonService bonService;
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
	
	
}
