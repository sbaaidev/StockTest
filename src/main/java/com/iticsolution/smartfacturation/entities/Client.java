package com.iticsolution.smartfacturation.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String codeClient;
	private String nom;
	private String adresse;
	private String email;
	private String ville;
	private String formeJuridique ;
	private String ifisc;
	private String patente;
	private String RC;
	private String tribunal ;
	private String ice;
	private double capital ; 
	private String banque;
	private String numRIB;
	private String gsm;
	private String tel;
	private String cin;
	private String type;
	@OneToMany(mappedBy = "client")
	private List<BonService>  bonservice;
	@OneToMany(mappedBy = "client")
	private List<Devis>  devis;
	@CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

}
