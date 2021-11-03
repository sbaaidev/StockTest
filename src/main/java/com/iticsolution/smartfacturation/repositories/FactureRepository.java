package com.iticsolution.smartfacturation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iticsolution.smartfacturation.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long>{

}
