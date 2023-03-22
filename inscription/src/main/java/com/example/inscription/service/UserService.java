package com.example.inscription.service;

import com.example.inscription.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public interface UserService {
    public List<User> findAll();
    public User findOne(@PathVariable("id") String userId);
    public User create(@RequestBody User user);
    public User update(@PathVariable("id") String id, @RequestBody User user);
    public void delete(@PathVariable("id") String id);
}
