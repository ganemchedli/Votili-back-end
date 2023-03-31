package com.example.demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends Personne {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, String nom, String prenom, String login, String password, int numcin) {
		super(id, nom, prenom, login, password, numcin);
		// TODO Auto-generated constructor stub
	}

	
	
}
