package com.sala.controller;

import com.sala.model.Sala;
import com.sala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaService service;

    @GetMapping
    public List<Sala> listar() {
        return service.listar();
    }
    
    @GetMapping("/{salaId}")
    public Sala getSala(@PathVariable Long salaId) {
        return service.getSala(salaId);
    }

    @PostMapping("/salvar")
    public Sala salvar(@RequestBody Sala sala) {
        return service.salvar(sala);  
    }
}
