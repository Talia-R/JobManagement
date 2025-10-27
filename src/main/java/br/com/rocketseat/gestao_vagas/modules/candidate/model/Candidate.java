package br.com.rocketseat.gestao_vagas.modules.candidate.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import br.com.rocketseat.gestao_vagas.modules.candidate.candidateDTO.CandidateDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data // add getters and sets automatically by lombok
@Entity(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    @CreationTimestamp
    private LocalDateTime createdAt;
}
