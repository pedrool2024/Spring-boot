package com.aulaspring.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class pacienteEntity {

    String nome;
    String idade;
    String email;
    int cpf;

}
