package com.example.boutique.service;

import com.example.boutique.entities.Boutique;
import com.example.boutique.entities.Client;
import com.example.boutique.repositories.BoutiqueRepository;
import com.example.boutique.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient implements IServiceClient{
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private BoutiqueRepository boutiqueRepository;

    @Override
    public void ajouterClientBoutiques(Client client, List<Long> idBoutiques) {
        List<Boutique> listeBoutiques = null;
        for (Long a:idBoutiques) {
            listeBoutiques.add(boutiqueRepository.findById(a).get());
            client.setBoutiques(listeBoutiques);
        }
        clientRepository.save(client);
    }

    @Override
    public List<Client> listeClients(Long idBoutique) {
        List<Client> client= clientRepository.findAllByBoutiques(idBoutique);
        return client;
    }
}
