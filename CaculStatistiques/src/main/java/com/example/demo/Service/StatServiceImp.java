package com.example.demo.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StatServiceImp implements StatService {
		
	
	@Override
	public Float CalculerStatAgeAs8ermin30(JsonNode json, int id) {
		// TODO Auto-generated method stub
		
		 int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		        int age = votantnode.get("age").asInt();
		        int idCond=votantnode.get("idcond").asInt();
		       
		        System.out.println(age);
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if (age < 30) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}

	@Override
	public Float CalculerStatAgebin30w50(JsonNode json, int id) {
		// TODO Auto-generated method stub
		 int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		        int age = votantnode.get("age").asInt();
		        int idCond=votantnode.get("idcond").asInt();
		       
		        System.out.println(age);
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if ((age > 30) && (age<50)) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);	
		    
	}

	@Override
	public Float CalculerStatAgeAkbermin50(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		        int age = votantnode.get("age").asInt();
		        int idCond=votantnode.get("idcond").asInt();
		       
		        System.out.println(age);
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (age>50) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);	
	}

	@Override
	public Float CalculerStatAnhomBac(JsonNode json, int id) { 
		// TODO Auto-generated method stub
		
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("diplome").asBoolean()) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}
	

	@Override
	public Float CalculerStatMandhomchBac(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (!votantnode.get("diplome").asBoolean()) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);

	}

	@Override
	public Float CalculerStatFemmes(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("genre").asText().equals("femme")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);

	}

	@Override
	public Float CalculerStatHomme(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("genre").asText().equals("homme")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}

	@Override
	public Float CalculerStatRegionNord(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("region").asText().equals("nord")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}

	@Override
	public Float CalculerStatRegionSud(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("region").asText().equals("sud")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);

	}

	@Override
	public Float CalculerStatRegionOuest(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("region").asText().equals("ouest")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}

	@Override
	public Float CalculerStatRegionEst(JsonNode json, int id) {
		// TODO Auto-generated method stub
		int count = 0;
		 int total=0;
		    JsonNode jsonvotants = json.get("personnes");
		    System.out.println("hedha table");
		    System.out.println(jsonvotants.toString());
		    total=jsonvotants.size();
		    System.out.println("l val mtee l total");
	        System.out.println(total);
		    
		    if(jsonvotants.isArray()) {
		 
		 
		    for (JsonNode votantnode : jsonvotants) {
		    	
		    	 
		       
		        int idCond=votantnode.get("idcond").asInt();
		        System.out.println(idCond);

		        if(idCond==id)
		        {
		        if  (votantnode.get("region").asText().equals("est")) {
		            count++;
		        }
		        
		        }
		        }
		    
		  
		    }
		    System.out.println("l val mtee l count");
		   
		    System.out.println(count);
		    
	       
		    return (float) (count*100/total);
	}

	@Override
	public List<Integer> calculstatGenerale(JsonNode json) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	
		/*
		 * // On crée un objet Map pour stocker le nombre d'occurrences de chaque idcond
		*/
		
		/*
		
		 HashMap<Integer, Integer> votes = new HashMap<Integer, Integer>();
		    int maxVotes = 0;
		    int winnerId = 0;
		    boolean isTie = false;

		    // Count votes for each idcond
		    JsonNode personnes = json.get("personnes");
		    for (JsonNode personne : personnes) {
		        int idcond = personne.get("idcond").asInt();
		        
		        int count = votes.getOrDefault(idcond, 0) + 1;
		        votes.put(idcond, count);
		        if (count > maxVotes) {
		            maxVotes = count;
		            winnerId = idcond;
		            isTie = false;
		        } else if (count == maxVotes) {
		            isTie = true;
		        }
		    }

		    // Check for winner or tie
		    if (isTie) {
		        return ("Égalité des résultats");
		    } else {
		        return("Le gagnant de l'élection est le candidat " + winnerId);
		    }
		    */
		Map<Integer, Integer> counts = new HashMap<>();
	    int maxCount = 0;
	    String res;
	    List<Integer> maxIds = new ArrayList<>();
	    JsonNode personnes = json.get("personnes");
	    for (JsonNode node : personnes) {
	        int idcond = node.get("idcond").asInt();
	        int count = counts.getOrDefault(idcond, 0) + 1;
	        counts.put(idcond, count);
	        if (count > maxCount) {
	            maxCount = count;
	            maxIds.clear();
	            maxIds.add(idcond);
	        } else if (count == maxCount) {
	            maxIds.add(idcond);
	        }
	    }
	    
	    
	    return maxIds;	
		}

	
	
	@Override
	public int CalculNbreVote(JsonNode json, int id) {
		int voteCount = 0;
		  JsonNode personnes = json.get("personnes");
		    for (JsonNode personne : personnes) {
		    	 int idcond = personne.get("idcond").asInt();
		         if (idcond == id) {
		             voteCount++;
		    	
		    	
		    	
		    }
		
	}
		    return voteCount;
	}	
		
		 
	
	

}
