package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
@DiscriminatorValue("ElectionStandard")
public class ElectionStandard extends Election {

	public ElectionStandard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectionStandard(Long id, String titre, String description, Date datecreation, Boolean statut) {
		super(id, titre, description, datecreation, statut);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ElectionStandard [getStatut()=" + getStatut() + ", getId()=" + getId() + ", getTitre()=" + getTitre()
				+ ", getDescription()=" + getDescription() + ", getDatecreation()=" + getDatecreation()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}




	
}
