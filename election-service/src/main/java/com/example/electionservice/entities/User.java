package com.example.electionservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("User")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Personne {
    private int age;
    private boolean bac;
    private Genre genre;
    private Region region;
    private Boolean droitDeVote;

    @Override
    public String toString() {
        return "User [age=" + age + ", bac=" + bac + ", genre=" + genre + ", region=" + region + ", DroitDeVote=" + droitDeVote + "]";
    }
}
