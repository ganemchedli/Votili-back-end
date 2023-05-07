package com.example.generationcodeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.generationcodeservice.entity.Code;

public interface CodeRepository extends JpaRepository<Code, Long> {
}
