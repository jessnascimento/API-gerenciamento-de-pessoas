package com.example.gerenciamento_pessoas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoas")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Integer idade;
}
