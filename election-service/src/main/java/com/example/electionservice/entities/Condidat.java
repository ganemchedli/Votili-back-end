package com.example.electionservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("Condidat")
public class Condidat extends Personne {

	private String pseudo;
    private int NbreVote;
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public int getNbreVote() {
		return NbreVote;
	}
	public void setNbreVote(int nbreVote) {
		NbreVote = nbreVote;
	}
	public Condidat(Long id, String nom, String prenom, String login, String password, int numcin, String pseudo,
			int nbreVote) {
		super(id, nom, prenom, login, password, numcin);
		this.pseudo = pseudo;
		NbreVote = nbreVote;
	}
	public Condidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Condidat(Long id, String nom, String prenom, String login, String password, int numcin) {
		super(id, nom, prenom, login, password, numcin);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Condidat [pseudo=" + pseudo + ", NbreVote=" + NbreVote + "]";
	}
    
	
	
	
}
