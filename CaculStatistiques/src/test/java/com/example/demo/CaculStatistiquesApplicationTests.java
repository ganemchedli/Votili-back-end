package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.StatServiceImp;
import com.example.demo.entity.Json;
import com.fasterxml.jackson.databind.JsonNode;

@SpringBootTest
class CaculStatistiquesApplicationTests {
	@Autowired
	public StatServiceImp service ; 
	
	
	@Test
	void contextLoads() {
		

		String jsonData = "{\"personnes\":[{\"idcond\":1,\"age\":55,\"genre\":\"homme\",\"diplome\":false,\"region\":\"nord\",\"login\":\"user1\",\"password\":\"pass1\"},{\"idcond\":1,\"age\":45,\"genre\":\"homme\",\"diplome\":false,\"region\":\"nord\",\"login\":\"user2\",\"password\":\"pass2\"},{\"idcond\":1,\"age\":28,\"genre\":\"femme\",\"diplome\":true,\"region\":\"ouest\",\"login\":\"user3\",\"password\":\"pass3\"}]}";
		Json data= new Json();
		JsonNode json;
	   json= data.jsonStringToJsonNode(jsonData);
	   System.out.println(json.toString());
	   System.out.println("hey");
	    
       service.calculstatGenerale(json);

	}

}
