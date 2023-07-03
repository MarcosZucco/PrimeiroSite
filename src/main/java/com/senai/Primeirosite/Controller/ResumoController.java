package com.senai.Primeirosite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Resumos")
public class ResumoController {
    @GetMapping
    public String resumo(){
        return "Resumos/resumo";
    }
}
