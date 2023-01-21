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
@Table(name = "centre_commercial")
public class CentreCommercial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String addresse;
    private String login;
    private String password;

    @OneToMany(mappedBy = "centreCommercial", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Boutique> boutiques;

    public List<Boutique> getBoutiques() {
        return boutiques;
    }

    public void setBoutiques(List<Boutique> boutiques) {
        this.boutiques = boutiques;
    }
}