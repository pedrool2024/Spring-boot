package com.aulaspring.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class MedicoAtualizacaoDTO {

    @NotNull 
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;

}

