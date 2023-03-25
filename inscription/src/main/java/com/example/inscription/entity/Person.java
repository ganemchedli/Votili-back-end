package com.example.inscription.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="person")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Person_type",discriminatorType = DiscriminatorType.INTEGER)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id ;
    protected String nom ;
    protected String prenom;
    //@Column(unique=true)
    protected String email ;
    protected String password;
    protected int numCin;
}
