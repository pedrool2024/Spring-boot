package com.aulaspring.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/pacientes")

@GetMapping("paciente")
public String getMethodName(@RequestParam String param) {
    return new String();
}

public class pacienteController {

}
