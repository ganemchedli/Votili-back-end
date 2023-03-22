package com.example.inscription.service.impl;
import com.example.inscription.entity.User;
import com.example.inscription.repository.UserRepository;
import com.example.inscription.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inscription.exception.NotFound;
import com.example.inscription.exception.BadRequest;
import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly=true)
    public List<User> findAll() {
        return repository.findAll();
    }

    @org.springframework.transaction.annotation.Transactional(readOnly=true)
    @Override
    public User findOne(String id) {
        return repository.findOne(id).orElseThrow(() ->
                new NotFound("User with id "+ id + "does not found"));
    }

    @org.springframework.transaction.annotation.Transactional
    @Override
    public User create(User user)  {
        Optional<User> mayExists = repository.findByEmail(user.getLogin());
        if(mayExists.isPresent()) {
            throw new BadRequest("User with email " +user.getLogin()+ "already exists");
        }
        return repository.save(user);
    }

    @org.springframework.transaction.annotation.Transactional
    @Override
    public User update(String id, User user) {
        repository.findOne(id).orElseThrow(() ->
                new NotFound("User with id "+ id + "does not found"));
        return repository.save(user);
    }

    @org.springframework.transaction.annotation.Transactional
    @Override
    public void delete(String id) {
        User found = repository.findOne(id).orElseThrow(() ->
                new NotFound("User with id "+ id + "does not found"));
        repository.delete(found);
    }
}
