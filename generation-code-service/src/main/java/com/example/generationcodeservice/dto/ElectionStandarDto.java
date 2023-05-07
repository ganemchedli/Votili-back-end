package com.example.generationcodeservice.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("ElectionStandard")
@Setter
@Getter
public class ElectionStandarDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected int codeId;
    protected String titre;
    protected String description;
    protected Date dateCreation;
    protected Boolean statut;

}
