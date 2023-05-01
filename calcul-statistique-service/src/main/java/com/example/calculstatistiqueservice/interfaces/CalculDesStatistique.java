package com.example.calculstatistiqueservice.interfaces;

import com.fasterxml.jackson.databind.JsonNode;

public interface CalculDesStatistique {

	public abstract float  CalculerStatistique(JsonNode data, int id);
	
}
