package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.demo.entity.Json;
import com.fasterxml.jackson.databind.JsonNode;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class CaculStatistiquesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaculStatistiquesApplication.class, args);
		
		
	    
	    
	
	}

}
