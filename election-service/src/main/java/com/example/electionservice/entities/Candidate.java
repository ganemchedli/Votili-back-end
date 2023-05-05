package com.example.electionservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;


@Entity
@DiscriminatorValue("Condidat")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends Personne {
	private String pseudo;
    private int nbreVote;
	@Override
	public String toString() {
		return "Condidat [pseudo=" + pseudo + ", NbreVote=" + nbreVote + "]";
	}
}
