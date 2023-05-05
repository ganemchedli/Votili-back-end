package com.example.demo.DTO;

import com.example.demo.entities.User;
import com.example.demo.entities.User.Genre;
import com.example.demo.entities.User.Region;

public class UserDTO extends PersonneDTO{
	
	private int age ;
	private boolean bac;
	
	public enum Genre{
		homme,femme
	}
	 private User.Genre genre;
	
	
	public enum Region{
		nord,sud,ouest,est}
	 private User.Region region;
	
	private Boolean DroitDeVote;

	

	

	public UserDTO(Long id, String nom, String prenom, String login, String password, int numcin, int age, boolean bac,
			com.example.demo.entities.User.Genre genre, com.example.demo.entities.User.Region region,
			Boolean droitDeVote) {
		super(id, nom, prenom, login, password, numcin);
		this.age = age;
		this.bac = bac;
		this.genre = genre;
		this.region = region;
		DroitDeVote = droitDeVote;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Long id, String nom, String prenom, String login, String password, int numcin) {
		super(id, nom, prenom, login, password, numcin);
		// TODO Auto-generated constructor stub
	}

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

	public User.Genre getGenre() {
		return genre;
	}

	public void setGenre(User.Genre genre) {
		this.genre = genre;
	}

	 public User.Region getRegion() {
	        return region;
	    }

	 public void setRegion(User.Region region) {
	        this.region = region;
	    }


	public Boolean getDroitDeVote() {
		return DroitDeVote;
	}

	public void setDroitDeVote(Boolean droitDeVote) {
		DroitDeVote = droitDeVote;
	}

	
	
}
