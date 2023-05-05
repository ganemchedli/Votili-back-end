package com.example.demo.DTO;

public class CondidatDTO extends PersonneDTO {

	private String pseudo;
    private int NbreVote;
	public CondidatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CondidatDTO(Long id, String nom, String prenom, String login, String password, int numcin) {
		super(id, nom, prenom, login, password, numcin);
		// TODO Auto-generated constructor stub
	}
	public CondidatDTO(Long id, String nom, String prenom, String login, String password, int numcin, String pseudo,
			int nbreVote) {
		super(id, nom, prenom, login, password, numcin);
		this.pseudo = pseudo;
		NbreVote = nbreVote;
	}
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
	
}
