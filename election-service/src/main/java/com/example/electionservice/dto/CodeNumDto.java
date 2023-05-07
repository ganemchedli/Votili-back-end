package com.example.electionservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Codenum")
@AllArgsConstructor
@NoArgsConstructor
public class CodeNumDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "code_num")
    private String codeNum;
}
