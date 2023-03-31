package com.example.demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("User")
public class User extends Personne {

	private int age ;
	private boolean bac;
	public enum Genre{
		homme,femme
	}
	private Genre genre ;
	public enum Region{
		nord,sud,ouest,est}
	private Region region;
	private Boolean DroitDeVote;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBac() {
		return bac;
	}

	public void setBac(boolean bac) {
		this.bac = bac;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Boolean getDroitDeVote() {
		return DroitDeVote;
	}

	public void setDroitDeVote(Boolean droitDeVote) {
		DroitDeVote = droitDeVote;
	}

	public User(Long id, String nom, String prenom, String login, String password, int numcin, int age, boolean bac,
			Genre genre, Region region, Boolean droitDeVote) {
		super(id, nom, prenom, login, password, numcin);
		this.age = age;
		this.bac = bac;
		this.genre = genre;
		this.region = region;
		DroitDeVote = droitDeVote;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String nom, String prenom, String login, String password, int numcin) {
		super(id, nom, prenom, login, password, numcin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", bac=" + bac + ", genre=" + genre + ", region=" + region + ", DroitDeVote="
				+ DroitDeVote + "]";
	}
	
	
	
	
}
