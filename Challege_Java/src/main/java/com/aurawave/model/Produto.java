package com.aurawave.model;

import java.time.LocalDate;

public class Produto {
    private String uuid;
    private String nome;
    private int quantidade;
    private int estoqueMinimo;
    private String situacao;
    private LocalDate validade;

    public Produto() {}
    public Produto(String uuid, String nome, int quantidade, int estoqueMinimo, String situacao, LocalDate validade) {
        this.uuid = uuid; this.nome = nome; this.quantidade = quantidade; this.estoqueMinimo = estoqueMinimo; this.situacao = situacao; this.validade = validade;
    }
    public String getUuid() { return uuid; } public void setUuid(String uuid) { this.uuid = uuid; }
    public String getNome() { return nome; } public void setNome(String nome) { this.nome = nome; }
    public int getQuantidade() { return quantidade; } public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public int getEstoqueMinimo() { return estoqueMinimo; } public void setEstoqueMinimo(int estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }
    public String getSituacao() { return situacao; } public void setSituacao(String situacao) { this.situacao = situacao; }
    public LocalDate getValidade() { return validade; } public void setValidade(LocalDate validade) { this.validade = validade; }
}
