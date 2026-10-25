package com.aulaspring.api.dto;

import com.aulaspring.api.entity.MedicoEntity;

import lombok.Getter;

@Getter   
public class MedicoRespostaDTO {

    private final long id;
    private final String nome;
    private final String crm;
    private final String especialidade;

    public MedicoRespostaDTO(MedicoEntity medico) {
        this.id = medico.getId();
        this.nome = medico.getNome();
        this.crm = medico.getCrm();
        this.especialidade = medico.getEspecialidade() != null
                                    ? medico.getEspecialidade().name()
                                    : null;
    }

}
