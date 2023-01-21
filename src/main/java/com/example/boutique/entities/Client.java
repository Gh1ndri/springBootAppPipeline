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
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Genre genre;


    @ManyToMany(mappedBy = "clients")
    private List<Boutique> boutiques;

    public List<Boutique> getBoutiques() {
        return boutiques;
    }

    public void setBoutiques(List<Boutique> boutiques) {
        this.boutiques = boutiques;
    }
}