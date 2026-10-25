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
public class MedicoCadastroDTO {

    @NotBlank 
    private String nome;

    @NotBlank @Email
    private String email;

    @NotNull 
    private int idade;

    @NotBlank
    private String telefone;

    @NotBlank @Pattern(regexp = "\\d{4,6}")
    private String crm;

    @NotBlank 
    private String especialidade;

    @NotNull 
    private Boolean experiencia; 

    @NotBlank
    private EnderecoDTO endereco;

}
