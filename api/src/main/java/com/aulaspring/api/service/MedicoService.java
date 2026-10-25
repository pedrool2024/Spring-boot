package com.aulaspring.api.service;

import org.springframework.stereotype.Service;

import com.aulaspring.api.dto.MedicoAtualizacaoDTO;
import com.aulaspring.api.dto.MedicoCadastroDTO;
import com.aulaspring.api.repository.MedicoRepository;
import com.aulaspring.api.entity.MedicoEntity;
import com.aulaspring.api.service.MedicoService;

import java.util.List;

@Service 
public class MedicoService {

    private final MedicoRepository repository;

    public MedicoService (MedicoRepository repository){
        this.repository = repository;
}

    public MedicoEntity cadastrar (MedicoCadastroDTO dados) {
              
        if (dados.getIdade() < 18) {
            throw new IllegalArgumentException ("O médico deve ter pelo menos 18 anos");
        }        
        if (!dados.getExperiencia()){
            throw new IllegalArgumentException("O médico deve ter experiência");
        }  
            MedicoEntity medico = new MedicoEntity();
            medico.setNome(dados.getNome());
            medico.setIdade(dados.getIdade());
            medico.setExperiencia(dados.getExperiencia());

            return repository.save(medico);
    }

    public List<MedicoEntity> listar() {
        return repository.findAll();
    }

    public MedicoEntity buscarPorId (Long id) {
        return repository.findById(id).orElse(null);
    }

    public MedicoEntity atualizar(MedicoAtualizacaoDTO dados) {
        MedicoEntity medico = repository.findById(dados.getId()).orElse(null);
        if (medico == null) {
            throw new IllegalArgumentException("Medico não encontrado");
        }
        if (dados.getId() != null) {
            medico.setId(dados.getId());
        }
        if (dados.getNome() != null) {
            medico.setNome(dados.getNome());
        }
        if (dados.getTelefone() != null) {
            medico.setTelefone(dados.getTelefone());
        }
        if (dados.getEndereco() != null) {
            medico.setEndereco(dados.getEndereco());
        }
        return repository.save(medico);
    } 
}
