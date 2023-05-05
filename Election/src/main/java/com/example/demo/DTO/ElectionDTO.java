package com.example.demo.DTO;

import java.util.Date;

public class ElectionDTO {
	
	private Long id;
	private String Code;
	private String titre;
	private String description;
	private Date datecreation;
	private Boolean statut;
	public ElectionDTO(Long id, String code, String titre, String description, Date datecreation, Boolean statut) {
		super();
		this.id = id;
		Code = code;
		this.titre = titre;
		this.description = description;
		this.datecreation = datecreation;
		this.statut = statut;
	}
	public ElectionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
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
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	
	
}
