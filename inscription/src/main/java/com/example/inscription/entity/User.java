package com.example.inscription.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@DiscriminatorValue("1")
public class User extends Person  {
    private int age ;
    private Genre genre ;
    private boolean droitDeVote;
    private String region;
    private boolean bac ;

}
