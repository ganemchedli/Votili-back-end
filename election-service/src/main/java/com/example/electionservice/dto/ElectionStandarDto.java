package com.example.electionservice.dto;

import com.example.electionservice.entities.Personne;
import jakarta.persistence.*;
import lombok.Data;
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
}
