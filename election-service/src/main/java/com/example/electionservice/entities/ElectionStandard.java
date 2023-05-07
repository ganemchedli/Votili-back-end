package com.example.electionservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("ElectionStandard")
@Setter
@Getter
public class ElectionStandard extends Election{
	@Override
	public String toString() {
		return "ElectionStandard [getStatut()=" + getStatut() + ", getId()=" + getId() + ", getTitre()=" + getTitre()
				+ ", getDescription()=" + getDescription() + ", getDatecreation()=" + getDateCreation()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
