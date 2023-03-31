package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Election;
@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {

}
