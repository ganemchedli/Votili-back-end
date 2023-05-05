package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.CondidatDTO;
import com.example.demo.DTO.ElectionDTO;
import com.example.demo.DTO.UserDTO;
import com.example.demo.entities.Admin;
import com.example.demo.entities.Condidat;
import com.example.demo.entities.Election;
import com.example.demo.entities.ElectionProgrammee;
import com.example.demo.entities.ElectionStandard;
import com.example.demo.entities.Personne;
import com.example.demo.entities.User;

public interface ElectionService {

	ElectionProgrammee CreeElectionProgrammee(ElectionProgrammee ep);
	ElectionStandard CreeElectionStandard(ElectionStandard es);
	void OuvrirElection(Election election); // l attrib statut
	void FermerElection(Election election);
	//void UpdateElection();// 
	void SupprimerElection(Election election);
	void SupprimerElection(Long id);
	ElectionDTO getElectionbyid(Long id);
	
	List<ElectionDTO> getAllElection();
	List<ElectionDTO> getAllElectionuser(Long id);// les élections li cherek fihom user li id mteo id
	List<ElectionDTO> getAllElectionAdmin(Long id);// les élections li creehom l admin li id mteo id
	
	void AjouterUnUsers(User users , Long idElection); // ajout des users à l election
	void AssocieUnAdmin(Admin admin, Long idElection);
	void AjouterUnCondidats(Condidat condidats, Long idElection);
	
	List<CondidatDTO> getcondidatsbyelection (Long id);
	List<UserDTO> getusersbyelection (Long id);
	
	/* User ajouterUser(User user);
	 Condidat ajouterCondidat(Condidat condidat);
	 Personne ajouterpersonne(Personne personne);
	 
	 void SupprimerVotant(User user);
	  void SupprimerCondidat(Condidat condidat);
	  void SupprimerPersonne(Long id);
	 
	  List <Personne> test();
	 
	*/
}
