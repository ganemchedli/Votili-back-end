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

import com.example.demo.entities.Admin;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.ElectionProgrammee;
import com.example.demo.entities.ElectionStandard;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;
import com.example.demo.service.ElectionServiceImpl;
import com.example.demo.service.Personneserviceimpl;

@RestController
public class controller {

	@Autowired
	ElectionServiceImpl es;
	/*public controller(ElectionServiceImpl es, Personneserviceimpl ps) {
		super();
		this.es = es;
		this.ps = ps;
	}
*/
	@Autowired
	Personneserviceimpl ps;
	
	@RequestMapping("/hello")
	public String sayhello()
	{return "hello world!";
	}
	
	@RequestMapping("/test")
	public List<Election> GetAllElections()
	{
		
		
		return es.getAllElection();
	}
	
	
	@GetMapping (path= "/election/{id}")
	public Election GetElectionbyid(@PathVariable Long id)
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
	public List< Personne> getallpersonnes()
	{
		return ps.getallpersonnes();
		
	}
	
	@PostMapping (path= "/adduserElection/{id}")
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
	public String gatallElectionsPersonne(@PathVariable Long id)
	{
		String mess;
		
		List<String>res=ps.ReturnAllElectionPersonne(id);
		int lon =res.size();
		mess=mess= "cherek fi "+lon+" election w "+ " les election li cherek fihom l personne li ando id "+id +" sonts :";
		for(String code : res)
		{
			mess=mess+ code;
		}
		
		return mess;
		
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
	public Personne gatPersonnebyid(@PathVariable Long id)
	{
		return ps.getpersonnebyid(id);
		
	}
	
	
	
}
