package com.example.electionservice.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("ElectionProgramme")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ElectionProgrammee extends Election {
	private Date datedeb;
	private Date datefin;
	private int minvote;
	@Override
	public String toString() {
		return "ElectionProgrammee [datedeb=" + datedeb + ", datefin=" + datefin + ", Minvote=" + minvote + "]";
	}
}
