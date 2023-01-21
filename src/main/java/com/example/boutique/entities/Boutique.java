package com.example.boutique.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "boutique")
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ManyToMany
    @JoinTable(name = "boutique_clients",
            joinColumns = @JoinColumn(name = "boutique_id"),
            inverseJoinColumns = @JoinColumn(name = "clients_id"))
    private List<Client> clients;

    @ManyToOne
    @JoinColumn(name = "centre_commercial_id")
    private CentreCommercial centreCommercial;



    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public CentreCommercial getCentreCommercial() {
        return centreCommercial;
    }

    public void setCentreCommercial(CentreCommercial centreCommercial) {
        this.centreCommercial = centreCommercial;
    }


}