package com.example.authentification.repository;

import java.util.Optional;

import com.example.authentification.model.JwtRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<JwtRequest> findByUsername(String username);

    Boolean existsByUsername(String username);

     Optional<User> findByEmail(String email);
}