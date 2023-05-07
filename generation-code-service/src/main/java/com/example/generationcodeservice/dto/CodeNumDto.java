package com.example.generationcodeservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Codenum")
@AllArgsConstructor
@NoArgsConstructor
public class CodeNumDto extends CodeDto {
    @Column(name = "code_num")
    private String codeNum;
}
