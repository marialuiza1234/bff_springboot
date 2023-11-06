package br.com.marialuiza.aprendendobff.controller;

import br.com.marialuiza.aprendendobff.entity.Pessoa;
import br.com.marialuiza.aprendendobff.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    protected PessoaRepository pessoaRepository;

    @GetMapping(path = "/bff", produces = "application/json")
    public List<Pessoa> getPessoasBFF(){
        return pessoaRepository.getPessoas();
    }

}
