package com.iticsolution.smartfacturation.entities;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="LigneDevis")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LigneDevis implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private int quantite ;
	private double tauxTVA;
	private double mtHT;
	private double mtTVA;
	private double mtTTC;
	@JsonIgnore
	@ManyToOne
	private Devis devis;
	@ManyToOne
	private Article article ;
	
	

}
