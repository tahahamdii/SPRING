package com.example.demo.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "utilisateur")

public class User {
    @Id
    private long id ;
    @Column(name = "firstName")
    private String nom;
    @Column(name = "lastName")

    private String prenom ;
    private LocalDate dateNaissance; //JJ/MM/YYYY
    @Enumerated(EnumType.STRING)
    private Sexe sexe ;

    @Transient
    private int age ;

}
