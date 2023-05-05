package com.example.demo.service;

import java.util.Set;

import java.util.List;

import com.example.demo.DTO.ElectionDTO;
import com.example.demo.DTO.PersonneDTO;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;

public interface PersonneService {
	
	User ajouterUser(User user);
	 Condidat ajouterCondidat(Condidat condidat);
	 Personne ajouterpersonne(Personne personne);
	 
	 void SupprimerVotant(User user);
	  void SupprimerCondidat(Condidat condidat);
	  void SupprimerPersonne(Long id);
	 
	  // List<Personne> test();
	  PersonneDTO getpersonnebyid(Long id);
	  void ajouter(int id_p ,int id_E );
	  List <PersonneDTO> getallpersonnes();
	  List<ElectionDTO> ReturnAllElectionPersonne(Long id);
}
