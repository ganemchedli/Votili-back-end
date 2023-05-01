package com.example.calculstatistiqueservice.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
	
	
	public Json() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JsonNode jsonStringToJsonNode(String jsonString) {
	    ObjectMapper objectMapper = new ObjectMapper();
	    JsonNode jsonNode = null;
	    try {
	        jsonNode = objectMapper.readTree(jsonString);
	    } catch (JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return jsonNode;
	}
	
	public String sayhello()
	{
		return "hello world!";
	}

	@Override
	public String toString() {
		return "Json []";
	}

	
	
	
}
