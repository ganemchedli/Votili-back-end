package com.example.electionservice.service;

import java.util.Set;

import java.util.List;

import com.example.electionservice.entities.Condidat;
import com.example.electionservice.entities.Election;
import com.example.electionservice.entities.Personne;
import com.example.electionservice.entities.User;

public interface PersonneService {
	
	User ajouterUser(User user);
	 Condidat ajouterCondidat(Condidat condidat);
	 Personne ajouterpersonne(Personne personne);
	 
	 void SupprimerVotant(User user);
	  void SupprimerCondidat(Condidat condidat);
	  void SupprimerPersonne(Long id);
	 
	  // List<Personne> test();
	  Personne getpersonnebyid(Long id);
	  void ajouter(int id_p ,int id_E );
	  List <Personne> getallpersonnes();
	  List<String> ReturnAllElectionPersonne(Long id);
}
