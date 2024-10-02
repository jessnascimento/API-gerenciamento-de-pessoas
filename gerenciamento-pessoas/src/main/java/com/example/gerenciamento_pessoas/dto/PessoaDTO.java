package com.example.gerenciamento_pessoas.dto;

import com.example.gerenciamento_pessoas.entity.Pessoa;
import lombok.Data;

@Data
public class PessoaDTO {
    private String nome;
    private String cpf;
    private int idade;

    // Construtores, Getters e Setters
    public PessoaDTO() {}

    public PessoaDTO(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.cpf = pessoa.getCpf();
        this.idade = pessoa.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
