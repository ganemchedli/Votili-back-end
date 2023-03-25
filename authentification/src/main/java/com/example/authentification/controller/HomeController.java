package com.example.authentification.controller;

import com.example.authentification.model.JwtRequest;
import com.example.authentification.model.JwtResponse;
import com.example.authentification.repository.UserRepository;
import com.example.authentification.service.UserDetailsImpl;
import com.example.authentification.service.UserDetailsServiceImpl;
//import com.example.authentification.service.UserService;
//import com.example.authentification.utility.JWTUtility;
//import org.springframework.beans.factory.annotation.Autowired;
import com.example.authentification.utility.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.authentification.utility.JwtUtils;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HomeController {
    @Autowired
    private JwtUtils jwtUtility;
    @Autowired
    private AuthenticationManager authenticationManager ;
    @Autowired
    UserRepository userRepository;
    @Autowired
    private UserDetailsServiceImpl userService ;
    @GetMapping("/")
    public String home(){
        return "Welcome" ;
    }
    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        String username = jwtRequest.getUsername();
        String password = jwtRequest.getPassword();
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = JwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return new JwtResponse(token);
    }
        /*
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials", e);
        }

        final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtUtility.generateJwtToken((Authentication) userDetails);
        return new JwtResponse(token);
    }*/
}
