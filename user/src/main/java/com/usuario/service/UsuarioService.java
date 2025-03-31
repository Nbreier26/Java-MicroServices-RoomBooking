package com.usuario.service;

import com.usuario.model.Usuario;
import com.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Optional<Usuario> getUsuario(Long id) {
        return repository.findById(id);
    }

    public Optional<Usuario> buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }
}