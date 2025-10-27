package br.com.rocketseat.gestao_vagas.modules.candidate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rocketseat.gestao_vagas.modules.candidate.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, UUID>{
    
}
