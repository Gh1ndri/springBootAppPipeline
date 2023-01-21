package com.example.boutique.service;

import com.example.boutique.entities.Client;

import java.util.List;

public interface IServiceClient {
    public void ajouterClientBoutiques(Client client, List<Long> idBoutiques);

    public List<Client> listeClients(Long idBoutique);
}
