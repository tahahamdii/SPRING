package com.example.demo.DAO.Entities;


import jakarta.persistence.*;

import java.security.PrivateKey;
import java.util.Date;

@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id

    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;//java.util

    @Column(name="estValide")
    private boolean estvalide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> Etudiants ;

}
