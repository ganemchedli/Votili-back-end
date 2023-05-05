package com.example.electionservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electionservice.entities.Election;
@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {
}
