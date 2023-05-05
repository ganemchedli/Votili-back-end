package com.example.electionservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("Admin")
@Setter
@Getter

public class Admin extends Personne {
}
