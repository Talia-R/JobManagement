package br.com.rocketseat.gestao_vagas.modules.candidate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.gestao_vagas.modules.candidate.candidateDTO.CandidateDTO;
import br.com.rocketseat.gestao_vagas.modules.candidate.model.Candidate;
import br.com.rocketseat.gestao_vagas.modules.candidate.repository.CandidateRepository;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/")
    public CandidateDTO createCanditade(@Valid @RequestBody Candidate newCanditade) {
        this.candidateRepository.save(newCanditade);
        return newCanditade.createDTO();
    }
    
    public void createCandidate(){}

}
