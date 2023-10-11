package com.example.demo.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Bloc")
public class Bloc {

    @Id
    private long idBloc;

    @Column(name="nomBloc")
    private String nomBloc;


    @Column(name="capaciteBloc")
    private long capaciteBloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Chambre> Chambre ;

}
