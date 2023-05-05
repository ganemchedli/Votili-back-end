package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name="Election")

public abstract class Election {
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @ManyToMany
    @JoinTable(
			name="personne_election",
			joinColumns = @JoinColumn(referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
			)
    
         private List<Personne> personnes = new ArrayList<>();
	private String Code;
	
	
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	private String titre;
	private String description;
	private Date datecreation;
	
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	private Boolean statut;//(type enum : ouvert ,fermé ,en attente)
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Election() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Election(Long id, String titre, String description, Date datecreation, Boolean statut) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.datecreation = datecreation;
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "Election [id=" + id  + ", titre=" + titre + ", description=" + description
				+ ", datecreation=" + datecreation + ", statut=" + statut + "]";
	}
	
	
	
	
	
}
