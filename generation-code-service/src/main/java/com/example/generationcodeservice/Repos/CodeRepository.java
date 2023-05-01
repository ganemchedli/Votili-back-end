package com.example.generationcodeservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.generationcodeservice.entitie.Code;

public interface CodeRepository extends JpaRepository<Code, Long>{

}
