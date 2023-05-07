package com.example.generationcodeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.generationcodeservice.service.CodeserviceImpl;
import com.example.generationcodeservice.entity.Code;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerCode {
    @Autowired
    CodeserviceImpl cs;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/code/{id}")
    public Code getcodebyid(@PathVariable Long id) {
        return cs.getCode(id);
    }

    @GetMapping(path = "/creecodenum")
    public Code Creecodenum() {
        return cs.CreeCodeNum();
    }

    /*@PostMapping("/send-code")
    public ResponseEntity<String> sendCode(@RequestBody String code) {
        // Logic to send the code to another microservice using RestTemplate
        return ResponseEntity.ok("Code sent successfully!");
    }*/

    @PostMapping("/send-code")
    public ResponseEntity<String> sendCode(@RequestBody String code) {
        // Make a POST request to the other microservice
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(code, headers);
        restTemplate.postForEntity("http://other-microservice/send-code", request, String.class);

        return ResponseEntity.ok("Code sent successfully!");
    }
	/*@GetMapping (path ="/creeqrcode")
	public Code CreeQRcode() throws WriterException, IOException {
		return cs.CreeQRcode();
	}*/
}
