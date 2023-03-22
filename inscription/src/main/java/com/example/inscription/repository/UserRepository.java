package com.example.inscription.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inscription.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findAll();
    public Optional<User> findOne(String userId);
    public Optional<User> findByEmail(String email);
    public User save(User user);
    public void delete(User user);
}