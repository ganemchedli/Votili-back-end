package com.example.electionservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {
    private String storedCode;
    @PostMapping("/send-code")
    public ResponseEntity<String> receiveCode(@RequestBody String code) {
        storedCode = code;// Logic to store the code in the other microservice
        return ResponseEntity.ok("Code stored successfully!");
    }
}
