package com.example.gerenciamento_pessoas.repository;

import com.example.gerenciamento_pessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}