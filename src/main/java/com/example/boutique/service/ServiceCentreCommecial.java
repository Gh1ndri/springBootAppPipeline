package com.example.boutique.service;

import com.example.boutique.entities.Boutique;
import com.example.boutique.entities.CentreCommercial;
import com.example.boutique.repositories.CentreCommercialRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCentreCommecial implements ISercieCentreCommercial{
    @Autowired
    private CentreCommercialRepository centreCommercialRepository;

    @Override
    public void ajouter(CentreCommercial centre) {
        List<Boutique> listBoutiques= centre.getBoutiques();
        for (Boutique bts:listBoutiques) {
            bts.setCentreCommercial(centre);
        }
        centreCommercialRepository.save(centre);
    }
}
