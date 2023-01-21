package com.example.boutique.controllers;

import com.example.boutique.entities.Client;
import com.example.boutique.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IServiceClient iServiceClient;

    @GetMapping("/get/{idboutique}")
    public List<Client> listeClient(@PathVariable("idboutique") Long idBoutique){
       return iServiceClient.listeClients(idBoutique);
    }
}
