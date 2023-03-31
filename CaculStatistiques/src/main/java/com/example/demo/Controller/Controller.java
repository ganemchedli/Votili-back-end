package com.example.demo.Controller;

import javax.xml.crypto.Data;

import org.hibernate.mapping.List;
import org.hibernate.type.FormatMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StatService;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {
	
	@Autowired
	private StatService ss ; 

	
	@RequestMapping("/hello")
	public String sayhello()
	{
		return "hello world";
	}
	
	
	
	@GetMapping("/stat<30/{id}")
	public float calculstatagea9almil30(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatAgeAs8ermin30(jsonNode, id);
		
		
	}
	
	@GetMapping("/statbitween30and50/{id}")
	public float calculstatagebin30w50(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatAgebin30w50(jsonNode, id);
		
		
	}
	
	@GetMapping("/statakbermind50/{id}")
	public float calculstatageakbermin50(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatAgeAkbermin50(jsonNode, id);
		
		
	}
	
	@GetMapping("/statHavebac/{id}")
	public float calculstathavebac(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatAnhomBac(jsonNode, id);

	}
	
	@GetMapping("/statnotHavebac/{id}")
	public float calculstatnotbac(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatMandhomchBac(jsonNode, id);

	}
	
	@GetMapping("/statfemme/{id}")
	public float calculstatfemme(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatFemmes(jsonNode, id);

	}
	
	@GetMapping("/stathomme/{id}")
	public float calculstathomme(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatHomme(jsonNode, id);

	}
	
	@GetMapping("/statnord/{id}")
	public float calculstatnord(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatRegionNord(jsonNode, id);

	}
	
	@GetMapping("/statsud/{id}")
	public float calculstatsud(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatRegionSud(jsonNode, id);

	}
	
	@GetMapping("/statest/{id}")
	public float calculstatest(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatRegionEst(jsonNode, id);

	}
	
	@GetMapping("/statouest/{id}")
	public float calculstatouest(@RequestBody JsonNode jsonNode,@PathVariable int id) 
	{
		
		 return ss.CalculerStatRegionOuest(jsonNode, id);

	}
	
	@GetMapping("/winner")
	public String winner(@RequestBody JsonNode jsonNode) 
	{
		
		String res;
		int size=ss.calculstatGenerale(jsonNode).size();
		   
		   if (size == 1) {
		        res=("Le condidat gagnant est numéro : " + ss.calculstatGenerale(jsonNode).get(0));
		    } else {
		        res=("Il y a une égalité entre les condidats numéros : ");
		        for (int i = 0; i < size - 1; i++) {
		            res=res+(ss.calculstatGenerale(jsonNode).get(i) + " et ");
		        }
		        res=res+(ss.calculstatGenerale(jsonNode).get(size - 1));
		        res=res+" "+"avec un nombre de vote="+ ss.CalculNbreVote(jsonNode, ss.calculstatGenerale(jsonNode).get(0))+" "+"pour chacun";
		    }
return res;
	}
	
	
	
	
	
	
	
}
