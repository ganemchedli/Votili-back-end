package com.example.electionservice.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import lombok.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Election")
@Data
public abstract class Election {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		protected Long id;
    @ManyToMany
    @JoinTable(
			name="personne_election",
			joinColumns = @JoinColumn(referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "id")
			)
	protected List<Personne> personnes = new ArrayList<>();
	protected int codeId;
	protected String titre;
	protected String description;
	protected Date dateCreation;
	protected Boolean statut;//(type enum : ouvert ,fermé ,en attente)
	@Override
	public String toString() {
		return "Election [id=" + id  + ", titre=" + titre + ", description=" + description
				+ ", datecreation=" + dateCreation + ", statut=" + statut + "]";
	}
}
