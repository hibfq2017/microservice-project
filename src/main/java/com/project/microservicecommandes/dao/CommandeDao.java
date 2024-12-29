package com.project.microservicecommandes.dao;

import com.project.microservicecommandes.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande,Integer> {
}
