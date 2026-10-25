package com.aulaspring.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.api.dto.MedicoAtualizacaoDTO;
import com.aulaspring.api.dto.MedicoCadastroDTO;
import com.aulaspring.api.dto.MedicoDTO;
import com.aulaspring.api.dto.MedicoDetalhamentoDTO;
import com.aulaspring.api.dto.MedicoRespostaDTO;
import com.aulaspring.api.entity.MedicoEntity;
import com.aulaspring.api.service.MedicoService;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("medicos")
public class medicoController {

    private final MedicoService service;

    public medicoController (MedicoService service) {
        this.service = service;
    }

    @GetMapping("/listamedicos")
    public ArrayList<MedicoDTO> listarMedicos(@RequestParam (required = false) String nome){

        ArrayList<MedicoDTO> listarMedicos = new ArrayList<MedicoDTO>();

        listarMedicos.add(new MedicoDTO("João", "Cardiologia", "123"));
        listarMedicos.add(new MedicoDTO("Maria", "Pediatria", "456" ));
        listarMedicos.add(new MedicoDTO("Carlos", "Ortopedia", "789"));

        return listarMedicos;
    }
    
    @PostMapping
    public ResponseEntity<MedicoRespostaDTO> cadastrar (@RequestBody @Valid MedicoCadastroDTO dados) {
        MedicoEntity medico = service.cadastrar(dados); 
        return ResponseEntity.ok(new MedicoRespostaDTO(medico));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoDetalhamentoDTO> detalhar (@PathVariable Long id) {
        MedicoEntity medico = service.buscarPorId(id);
        return ResponseEntity.ok(new MedicoDetalhamentoDTO(medico));
    }

    @GetMapping
    public List<MedicoRespostaDTO> listar() {
        return service.listar().stream()
            .sorted(Comparator.comparing(MedicoEntity::getNome))
            .map(MedicoRespostaDTO::new)
            .toList();
    }
     
    @PutMapping
    public ResponseEntity<MedicoRespostaDTO> atualizar (@RequestBody @Valid MedicoAtualizacaoDTO dados) {
        MedicoEntity medico = service.atualizar(dados);
        return ResponseEntity.ok(new MedicoRespostaDTO(medico));
        
    }
}
