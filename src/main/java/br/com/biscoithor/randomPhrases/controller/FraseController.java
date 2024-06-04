package br.com.biscoithor.randomPhrases.controller;

import br.com.biscoithor.randomPhrases.dto.FraseDTO;
import br.com.biscoithor.randomPhrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController
{
    @Autowired
    private FraseService service;


    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria()
    {
        return service.obterFraseAleatoria();
    }
}
