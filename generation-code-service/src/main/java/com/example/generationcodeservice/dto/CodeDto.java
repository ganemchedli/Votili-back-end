package com.example.generationcodeservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class CodeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
