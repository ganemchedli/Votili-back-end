package com.example.demo.service;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ElectionDTO;
import com.example.demo.DTO.PersonneDTO;
import com.example.demo.Repository.ElectionRepository;
import com.example.demo.Repository.PersonneRepository;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
 
@Service
@Transactional
public class Personneserviceimpl implements PersonneService{

     @Autowired
	private PersonneRepository pr;
     @Autowired
	private ElectionRepository er;
	  

	
	@Override
	public User ajouterUser(User user) {
		// TODO Auto-generated method stub
		return pr.save(user);
	}

	@Override
	public Condidat ajouterCondidat(Condidat condidat) {
		// TODO Auto-generated method stub
		return pr.save(condidat);
	}

	@Override
	public Personne ajouterpersonne(Personne personne) {
		// TODO Auto-generated method stub
		return pr.save(personne);
	}

	@Override
	public void SupprimerVotant(User user) {
		// TODO Auto-generated method stub
		pr.delete(user);
	}

	@Override
	public void SupprimerCondidat(Condidat condidat) {
		// TODO Auto-generated method stub
		pr.delete(condidat);
	}

	@Override
	public void SupprimerPersonne(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public void ajouter(int id_p, int id_E) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonneDTO> getallpersonnes() {
		// TODO Auto-generated method stub
		List<PersonneDTO> res= new ArrayList<>();
				
		List<Personne> pers;
		pers=pr.findAll();
		
		
	    for (Personne p : pers) {
	    	PersonneDTO PersonneDTO = new PersonneDTO();
	    	PersonneDTO.setId(p.getId());
	    	PersonneDTO.setNom(p.getNom());
	    	PersonneDTO.setPrenom(p.getPrenom());
	    	PersonneDTO.setLogin(p.getLogin());
	    	PersonneDTO.setPassword(p.getPassword());
	    	PersonneDTO.setNumcin(p.getNumcin());
	       
	        res.add(PersonneDTO);
	    }

		
		return res;
		
		
	}
	
	@Override
	public List<ElectionDTO> ReturnAllElectionPersonne(Long id) {
		// TODO Auto-generated method stub
		List<ElectionDTO> reslt =new ArrayList<>();
				
		List<Election> res= new ArrayList<>();
		Personne per = pr.findById(id).orElseThrow(() ->new EntityNotFoundException("personne n existe pas"));
		for(Election election :per.getElections())
		{
			res.add(election);
			
		}
		
		 for (Election e : res) {
		        ElectionDTO electionDTO = new ElectionDTO();
		        electionDTO.setId(e.getId());
		        electionDTO.setCode(e.getCode());
		        electionDTO.setTitre(e.getTitre());
		        electionDTO.setDescription(e.getDescription());
		        electionDTO.setStatut(e.getStatut());
		        reslt.add(electionDTO);
		    }
		
		return reslt;
		
	}
	@Override
	public PersonneDTO getpersonnebyid(Long id)
	{
		PersonneDTO per= new PersonneDTO();
		Personne p;
		p=pr.findById(id).get();
		
		per.setId(p.getId());
		per.setNom(p.getNom());
		per.setPrenom(p.getPrenom());
		per.setLogin(p.getLogin());
		per.setPassword(p.getPassword());
		per.setNumcin(p.getNumcin());
				
		return per;
		
	}

	
	
}
