package com.sala.service;

import com.sala.model.Sala;
import com.sala.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private SalaRepository repository;

    public List<Sala> listar() {
        return repository.findAll();
    }

    public Sala getSala(Long salaId) {
        return repository.findById(salaId)
                .orElseThrow(() -> new RuntimeException("Sala não encontrada"));
    }

    public Sala salvar(Sala sala) {
        return repository.save(sala);
    }
}
