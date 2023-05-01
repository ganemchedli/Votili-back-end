package com.example.electionservice.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
@DiscriminatorValue("ElectionProgramme")
public class ElectionProgrammee extends Election {
	private Date datedeb;
	private Date datefin;
	private int Minvote;
	
	
	public Date getDatedeb() {
		return datedeb;
	}
	public void setDatedeb(Date datedeb) {
		this.datedeb = datedeb;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public int getMinvote() {
		return Minvote;
	}
	public void setMinvote(int minvote) {
		Minvote = minvote;
	}
	public ElectionProgrammee(Date datedeb, Date datefin, int minvote) {
		super();
		this.datedeb = datedeb;
		this.datefin = datefin;
		Minvote = minvote;
	}
	public ElectionProgrammee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectionProgrammee(Long id, String titre, String description, Date datecreation, Boolean statut) {
		super(id, titre, description, datecreation, statut);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ElectionProgrammee [datedeb=" + datedeb + ", datefin=" + datefin + ", Minvote=" + Minvote + "]";
	}
	
	
}
