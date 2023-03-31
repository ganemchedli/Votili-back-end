package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Personne;
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
