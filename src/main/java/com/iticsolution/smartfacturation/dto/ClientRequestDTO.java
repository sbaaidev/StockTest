package com.iticsolution.smartfacturation.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.iticsolution.smartfacturation.entities.LigneBonService;
import com.iticsolution.smartfacturation.entities.LigneDevis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ClientRequestDTO {
	private Long id;
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

}
