package com.mballem.tarefas.jpa.dto;

public class AlunoArmariodto {

    private String nome;
    private Integer numero;

    public AlunoArmariodto(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }
}
