package com.example.boutique.repositories;

import com.example.boutique.entities.Boutique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> {
}
