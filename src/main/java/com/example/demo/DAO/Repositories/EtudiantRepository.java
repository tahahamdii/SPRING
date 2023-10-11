package com.example.demo.DAO.Repositories;

import com.example.demo.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,long> {
}
