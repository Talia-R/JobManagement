package br.com.rocketseat.gestao_vagas.modules.candidate.model;

import java.util.UUID;

import lombok.Data;

@Data // add getters and sets automatically by lombok
public class Candidate {
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;
}
