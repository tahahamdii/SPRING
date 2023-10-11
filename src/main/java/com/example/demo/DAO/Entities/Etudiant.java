package com.example.demo.DAO.Entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Etudiant")
public class Etudiant {

    @Id

    private long idEtudiant;

    @Column(name="nomEt")
    private String nomEtuduant;

    @Column(name="prenomEt")
    private String prenomEtuduant;

    @Column(name="cin")
    private long cin;

    @Column(name="ecole")
    private String ecole;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations ;

}
