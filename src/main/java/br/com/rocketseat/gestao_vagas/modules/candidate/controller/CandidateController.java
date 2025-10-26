package br.com.rocketseat.gestao_vagas.modules.candidate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.gestao_vagas.modules.candidate.model.Candidate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void createCanditade(@RequestBody Candidate newCanditade) {
        System.out.println("Candidate: ");
        System.out.println(newCanditade.createDTO());
    }
    
    public void createCandidate(){}

}
