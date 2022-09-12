package com.kalutiz.integracaoviacep.controllers;

import com.kalutiz.integracaoviacep.dto.CepDTO;
import com.kalutiz.integracaoviacep.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cep")
public class CepController {

    @Autowired
    private CepService service;

    @GetMapping(value = "/{cep}")
    public CepDTO findCep(@PathVariable String cep){
        return service.findCep(cep);
    }
}
