package com.example.demo.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Personnes")

public  class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private int numcin;
	
	@ManyToMany
	@JoinTable(
			name="personne_election",
			joinColumns = @JoinColumn(referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
			)
	private List<Election> elections = new ArrayList<>();
	 
	
	
	public List<Election> getElections() {
		return elections;
	}
	public void setElections(List<Election> elections) {
		this.elections = elections;
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
	public Personne(Long id, String nom, String prenom, String login, String password, int numcin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.numcin = numcin;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", numcin=" + numcin + "]";
	}
	
	
	
}
