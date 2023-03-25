package com.example.inscription.entity;

import jakarta.persistence.DiscriminatorValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@DiscriminatorValue("User")
public class User extends Person {
    private int age ;
    private Genre genre ;
    private boolean droitDeVote;
    private String region;
    private boolean bac ;


}
