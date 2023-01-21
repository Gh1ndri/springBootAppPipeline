package com.example.boutique.controllers;

import com.example.boutique.entities.CentreCommercial;
import com.example.boutique.service.ISercieCentreCommercial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/centre")
public class CentreCommercialController {
    @Autowired
    private ISercieCentreCommercial iSercieCentreCommercial;

    @PostMapping("/save")
    public void ajoutCentre(@RequestBody CentreCommercial centre){
        iSercieCentreCommercial.ajouter(centre);
    }
}
