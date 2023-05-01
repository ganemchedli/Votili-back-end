package com.example.calculstatistiqueservice.Service;

import java.util.List;

import com.example.calculstatistiqueservice.entity.Json;
import com.fasterxml.jackson.databind.JsonNode;

public interface StatService {
	
	
	
	Float  CalculerStatAgeAs8ermin30(JsonNode data,int id);
	Float  CalculerStatAgebin30w50(JsonNode data,int id);
	Float  CalculerStatAgeAkbermin50(JsonNode data,int id);
	Float  CalculerStatAnhomBac(JsonNode data,int id);
	Float  CalculerStatMandhomchBac(JsonNode data,int id);
	Float  CalculerStatFemmes(JsonNode data,int id);
	Float  CalculerStatHomme(JsonNode data,int id);
	Float  CalculerStatRegionNord(JsonNode data,int id);
	Float  CalculerStatRegionSud(JsonNode data,int id);
	Float  CalculerStatRegionOuest(JsonNode data,int id);
	Float  CalculerStatRegionEst(JsonNode data,int id);
	List<Integer>    calculstatGenerale(JsonNode data);
	int    CalculNbreVote(JsonNode data,int id);
	
	
	
	
	
	

}
