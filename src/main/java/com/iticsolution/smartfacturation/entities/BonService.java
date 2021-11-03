
package com.iticsolution.smartfacturation.entities;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonService implements Serializable {
	@Id @GeneratedValue
	private Long id;
	//@Column(unique = true,nullable = true)
	private String codeBS;
	private Instant dateBonService ;
	private String modeReglement ;
	private String numCheque ;
	private String numEffet;
	private String observBS;
	private double totalHT;
	private double totalTVA;
	private double totalTTC;
	
	@ManyToOne
	private Facture facture;
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy = "bonService")
	List<LigneBonService> ligneBonService;
	@OneToMany(mappedBy = "bonService")
	private List<ReglementClient> reglement;
	
	@CreationTimestamp
    private LocalDateTime createDateTime;
 
    @UpdateTimestamp
    private LocalDateTime updateDateTime;
    

    
	
}

