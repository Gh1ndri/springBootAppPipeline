package com.example.boutique.service;

import com.example.boutique.entities.Boutique;
import com.example.boutique.entities.CentreCommercial;
import com.example.boutique.repositories.BoutiqueRepository;
import com.example.boutique.repositories.CentreCommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBoutique implements IServiceBoutique{
    @Autowired
    private CentreCommercialRepository centreCommercialRepository;
    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @Override
    public void ajouteretaffecter(Boutique lb, Long idCentre) {
        CentreCommercial centre= centreCommercialRepository.findById(idCentre).get();
        lb.setCentreCommercial(centre);
        boutiqueRepository.save(lb);
    }
}
