package com.aulaspring.api.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.api.dto.pacienteDTO;

@RestController
@Controller
@RequestMapping

public class pacienteController {

    @GetMapping("/pacientes")
    public ArrayList<pacienteDTO> listarPaciente() {

        ArrayList<pacienteDTO> listarPaciente = new ArrayList<pacienteDTO>();
        listarPaciente.add(new pacienteDTO("Pedro", "pedro@gmail.com", "23", "Paulista", "masculino"));
        listarPaciente.add(new pacienteDTO("Lucas", "lucas@gmail.com", "20", "Recife", "masculino"));
        listarPaciente.add(new pacienteDTO("Borges", "borges@gmail.com", "25", "Olinda", "Masculino"));

        return listarPaciente;
    }
}
