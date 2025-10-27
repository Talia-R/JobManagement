package br.com.rocketseat.gestao_vagas.modules.candidate.model;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import br.com.rocketseat.gestao_vagas.modules.candidate.candidateDTO.CandidateDTO;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data // add getters and sets automatically by lombok
public class Candidate {
    private UUID id;

    private String name;

    @Email(message = "O campo deve conter um e-mail válido.")
    private String email;

    @Pattern(regexp = "^\\S+", message = "Nome de usuário não deve conter espaços.")
    private String username;

    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;

    public CandidateDTO createDTO(){
        return new CandidateDTO(username, description);
    }
}
