package com.reserva.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaDTO {
    private Long id;
    private String nome;
    private int capacidade;
}
