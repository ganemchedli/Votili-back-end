package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CondidatDTO;
import com.example.demo.DTO.ElectionDTO;
import com.example.demo.DTO.PersonneDTO;
import com.example.demo.DTO.UserDTO;
import com.example.demo.entities.Admin;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.ElectionProgrammee;
import com.example.demo.entities.ElectionStandard;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;
import com.example.demo.service.ElectionServiceImpl;

import com.example.demo.service.Personneserviceimpl;

import io.micrometer.observation.Observation;




@RestController
public class controller {

	@Autowired
	ElectionServiceImpl es;
	/*public controller(ElectionServiceImpl es, Personneserviceimpl ps) {
		super();
		this.es = es;
		this.ps = ps;
	}*/

	@Autowired
	Personneserviceimpl ps;
	
	
	
	@RequestMapping("/hello")
	public String sayhello()
	{return "hello world!";
	}
	
	@RequestMapping("/test")
	public List<ElectionDTO> GetAllElections()
	{
		
		
		return es.getAllElection();
	}
	
	
	@GetMapping (path= "/election/{id}")
	public ElectionDTO GetElectionbyid(@PathVariable Long id)
	{
		
		return es.getElectionbyid(id);
		
	}
	
	@PostMapping (path="/addElectionprograme")
	public ElectionProgrammee creeElectionProgrammee(@RequestBody ElectionProgrammee EP )
	{
		
		return es.CreeElectionProgrammee(EP);
	}
	
	@PostMapping (path="/addElectionstandard")
	public ElectionStandard creeElectionstandard(@RequestBody ElectionStandard Es )
	{
		
		return es.CreeElectionStandard(Es);
	}
	
	@DeleteMapping (path="/deleteelection/{id}")
	public void delete(@PathVariable Long id)
	
	{
		es.SupprimerElection(id);
	
	}
	
	@GetMapping (path= "/personnes")
	public List< PersonneDTO> getallpersonnes()
	{
		return ps.getallpersonnes();
		
	}
	
	@PostMapping (path= "/adduserElection/{id}") // ajouter un utilisateur à une élection
	public void adduserElection (@RequestBody User per,@PathVariable Long id)
	{
		
		 es.AjouterUnUsers(per, id);
	}
	@PostMapping (path= "/addAdmin/{id}")
	public void addusersElection (@RequestBody Admin admin, @PathVariable Long id)
	{
		
		 es.AssocieUnAdmin(admin, id);
	}
	
	@PostMapping (path= "/addCondidat/{id}")
	public void addCondidatsElection (@RequestBody Condidat condidats, @PathVariable Long id)
	{
		
		 es.AjouterUnCondidats(condidats, id);
	}
	
	@GetMapping (path= "/getallelectionpersonne/{id}")
	public List<ElectionDTO> gatallElectionsPersonne(@PathVariable Long id)
	{
		String mess;
		
		return ps.ReturnAllElectionPersonne(id);
		
		
	}
	
	
	
	
	@PostMapping (path= "/addpersonne")
	public Personne save (@RequestBody Personne per)
	{
		
		return ps.ajouterpersonne(per);
	}
	
	@PostMapping (path= "/adduser")
	public Personne save (@RequestBody User user)
	{
		
		return ps.ajouterpersonne(user);
	}
	
	@PostMapping (path= "/addcondidat")
	public Personne save (@RequestBody Condidat cond)
	{
		
		return ps.ajouterpersonne(cond);
	}
	
	@DeleteMapping (path= "/deletpersonne/{id}")
	public void deletepersonne (@PathVariable Long id)
	{
		
		 ps.SupprimerPersonne(id);
				
	}
	
	@GetMapping (path= "/personne/{id}")
	public PersonneDTO gatPersonnebyid(@PathVariable Long id)
	{
		return ps.getpersonnebyid(id);
		
	}
	
	@GetMapping (path="/getcondidatsbyelection/{id}")  // return tout les condidats fi élection mo3ayna
	public List<CondidatDTO> getcondidatsbyelection (@PathVariable Long id)
	{
		return  es.getcondidatsbyelection(id);
		
	}
	
	@GetMapping (path="/getusersbyelection/{id}")  // return tout les users fi élection mo3ayna
	public List<UserDTO> getusersbyelection (@PathVariable Long id)
	{
		return es.getusersbyelection(id);
		
		
	}
	
	
}
