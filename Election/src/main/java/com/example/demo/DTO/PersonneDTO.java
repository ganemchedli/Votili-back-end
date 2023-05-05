package com.example.demo.DTO;

public class PersonneDTO {

	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private int numcin;
	public PersonneDTO(Long id, String nom, String prenom, String login, String password, int numcin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.numcin = numcin;
	}
	public PersonneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumcin() {
		return numcin;
	}
	public void setNumcin(int numcin) {
		this.numcin = numcin;
	}
	
}
