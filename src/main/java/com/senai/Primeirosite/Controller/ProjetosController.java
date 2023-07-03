package com.senai.Primeirosite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Projetos")
public class ProjetosController {
    @GetMapping
    public String Projetos(){
        return "Projetos/projeto";
    }
}
