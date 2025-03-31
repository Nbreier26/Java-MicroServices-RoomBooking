package com.reserva.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
}
