package com.example.authentification.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.sql.*;

import java.util.ArrayList;
@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //logic to get the user from the database
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myuser", "xxxx");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select title, price, qty from books";
            ResultSet rset = stmt.executeQuery(strSelect);
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return new User("admin","password",new ArrayList<>());
    }
}
