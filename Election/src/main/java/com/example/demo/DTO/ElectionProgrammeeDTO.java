package com.example.demo.DTO;

import java.util.Date;

public class ElectionProgrammeeDTO extends ElectionDTO {
	
	private Date datedeb;
	private Date datefin;
	private int Minvote;
	public ElectionProgrammeeDTO(Long id, String code, String titre, String description, Date datecreation,
			Boolean statut, Date datedeb, Date datefin, int minvote) {
		super(id, code, titre, description, datecreation, statut);
		this.datedeb = datedeb;
		this.datefin = datefin;
		Minvote = minvote;
	}
	public ElectionProgrammeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectionProgrammeeDTO(Long id, String code, String titre, String description, Date datecreation,
			Boolean statut) {
		super(id, code, titre, description, datecreation, statut);
		// TODO Auto-generated constructor stub
	}
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

}
