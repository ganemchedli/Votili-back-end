package com.example.inscription.service;

import com.example.inscription.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public List<User> findAll();
    public User findOne(@PathVariable("id") Long userId);
    public User findByUsername(@PathVariable("nom") String nom);
    public User create(@RequestBody User user);
    public User update(@PathVariable("id") Long id, @RequestBody User user);
    public void delete(@PathVariable("id") Long id);
}
