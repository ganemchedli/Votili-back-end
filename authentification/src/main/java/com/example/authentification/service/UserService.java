package com.example.authentification.service;
/*
import com.example.authentification.model.JwtRequest;
import com.example.authentification.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JwtRequest user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

       return UserDetailsImpl.build(user);
        return new User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //logic to get the user from the database
        // Make REST API call to UserRepository microservice to fetch user details
        User user = restTemplate.getForObject("http://localhost:9020/users/" + username, User.class);
        // Throw exception if user not found
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
        );
    }
}
*/