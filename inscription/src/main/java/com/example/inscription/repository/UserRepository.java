package com.example.inscription.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inscription.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findAll();
    public Optional<User> findById(Long id);
    public Optional<User> findByEmail(String email);
    public User save(User user);
    public void delete(User user);
}