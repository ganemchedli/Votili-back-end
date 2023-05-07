package com.example.electionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    ElectionStandarDto electionStandarDto ;
    CodeNumDto codeNumDto ;
}
