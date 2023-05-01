package com.example.electionservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electionservice.entities.Personne;
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
