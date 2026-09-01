package com.aulaspring.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.api.dto.apiDTO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping
public class medicoControlador {

    @GetMapping("/medicos")
    public ArrayList<apiDTO> listarMedicos(@RequestParam (required = false) String nome){

        ArrayList<apiDTO> listarMedicos = new ArrayList<apiDTO>();

        listarMedicos.add(new apiDTO("João", "Cardiologia", "123"));
        listarMedicos.add(new apiDTO("Maria", "Pediatria", "456" ));
        listarMedicos.add(new apiDTO("Carlos", "Ortopedia", "789"));

        return listarMedicos;
    }
    
    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
