package com.example.boutique.repositories;

import com.example.boutique.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public List<Client> findAllByBoutiques(Long id);
}
