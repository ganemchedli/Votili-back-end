package com.example.electionservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Personnes")
@Data
public  class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private int numcin;
	@ManyToMany(mappedBy ="personnes")
	private List<Election> elections = new ArrayList<>();
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", numcin=" + numcin + "]";
	}
}
