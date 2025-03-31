package com.reserva.dto;

import java.time.LocalDateTime;
import com.reserva.model.Reserva;

import lombok.Data;

@Data
public class ReservaDTO {
    private Long id;
    private LocalDateTime dataHora;
    private UsuarioDTO usuario;
    private SalaDTO sala;

    public ReservaDTO(Reserva reserva, UsuarioDTO usuario, SalaDTO sala) {
        this.id = reserva.getId();
        this.dataHora = reserva.getDataHora();
        this.usuario = usuario;
        this.sala = sala;
    }
}
