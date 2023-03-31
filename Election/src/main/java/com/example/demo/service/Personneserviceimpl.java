package com.example.demo.service;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<Personne> getallpersonnes() {
		// TODO Auto-generated method stub
		List<Personne> pers;
		pers=pr.findAll();
		return pers;
	}
	
	@Override
	public List<String> ReturnAllElectionPersonne(Long id) {
		// TODO Auto-generated method stub
		List<String> res= new ArrayList<>();
		Personne per = pr.findById(id).orElseThrow(() ->new EntityNotFoundException("personne n existe pas"));
		for(Election election :per.getElections())
		{
			res.add(election.getCode());
			
		}
		return res;
		
	}
	@Override
	public Personne getpersonnebyid(Long id)
	{
		Personne p;
		p=pr.findById(id).get();
				
		return p;
		
	}

	
	
}
