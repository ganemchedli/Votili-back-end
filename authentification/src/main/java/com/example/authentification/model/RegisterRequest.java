package com.example.authentification.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest  {
    private  String firstname;
    private  String lastname;
    private  String email;
    private String password;
    private boolean bac ;
    private int age ;
    private  int numCin;
    private String region ;
    private Genre genre ;
    private Role role = Role.USER ;
   // MultipartFile file ;


}
