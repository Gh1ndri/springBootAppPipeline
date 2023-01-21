package com.example.boutique.controllers;

import com.example.boutique.entities.Boutique;
import com.example.boutique.entities.CentreCommercial;
import com.example.boutique.service.IServiceBoutique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boutique")
public class BoutiqueController {
    @Autowired
    private IServiceBoutique iServiceBoutique;

    @PostMapping("/save/{idcentre}")
    public void ajouterEtAffecterlisteBoutiques (@RequestBody List<Boutique> lb, @PathVariable("idcentre") Long idCentre){
        for (Boutique bts: lb) {
            iServiceBoutique.ajouteretaffecter(bts,idCentre);
        }
    }
}
