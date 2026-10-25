package com.aulaspring.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class MedicoDTO {
    public String nome;
    public String especialidade;
    public String crm;
}
