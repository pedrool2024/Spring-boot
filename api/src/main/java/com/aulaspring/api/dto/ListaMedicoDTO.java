package com.aulaspring.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class ListaMedicoDTO {

    private String nome;
    private String crm;
    private String especialidade;

}
