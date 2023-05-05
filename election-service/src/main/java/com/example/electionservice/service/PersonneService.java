package com.example.electionservice.service;

import java.util.List;

import com.example.electionservice.entities.Candidate;
import com.example.electionservice.entities.Personne;
import com.example.electionservice.entities.User;

public interface PersonneService {
	
	User ajouterUser(User user);
	 Candidate ajouterCondidat(Candidate candidate);
	 Personne ajouterpersonne(Personne personne);
	 
	 void SupprimerVotant(User user);
	  void SupprimerCondidat(Candidate candidate);
	  void SupprimerPersonne(Long id);
	 
	  // List<Personne> test();
	  Personne getpersonnebyid(Long id);
	  void ajouter(int id_p ,int id_E );
	  List <Personne> getallpersonnes();
	  List<String> ReturnAllElectionPersonne(Long id);
}
