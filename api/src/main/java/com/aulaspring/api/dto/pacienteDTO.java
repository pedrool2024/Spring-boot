package com.aulaspring.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class pacienteDTO {

    @NotBlank 
    private String nome;

    @NotBlank @Email 
    private String email;

    @NotBlank 
    private String idade;

    @NotBlank 
    private String cidade;

    @NotBlank
    private String genero;
    
}
