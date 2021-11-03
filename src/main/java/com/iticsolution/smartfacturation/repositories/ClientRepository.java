package com.iticsolution.smartfacturation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iticsolution.smartfacturation.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
