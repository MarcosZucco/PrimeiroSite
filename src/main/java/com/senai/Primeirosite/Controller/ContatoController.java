package com.senai.Primeirosite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Contatos")
public class ContatoController {
    @GetMapping
    public String Contatos(){
        return "Contatos/contato";
    }
}
