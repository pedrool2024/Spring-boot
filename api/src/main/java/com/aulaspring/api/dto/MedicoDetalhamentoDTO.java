package com.aulaspring.api.dto;

import com.aulaspring.api.entity.MedicoEntity;
import com.aulaspring.api.entity.MedicoEntity.Especialidade;

import lombok.Getter;

@Getter 
public class MedicoDetalhamentoDTO {
    
    private final Long id;
    private final String nome;
    private final int idade;
    private final String email;
    private final String crm;
    private final Especialidade especialidade;

        public MedicoDetalhamentoDTO(MedicoEntity medico) {
            this.id = medico.getId();
            this.nome = medico.getNome();
            this.idade = medico.getIdade();
            this.email = medico.getEmail();
            this.crm = medico.getCrm();
            this.especialidade = medico.getEspecialidade();
        } 
}
