package com.projeto.projetojava.view.model;

public class ProdutoRequest {

    // #region Atributos

    private String nome;

    private Integer quantidade;

    private Double valor;

    private String observacao;

    // #endregion

    // #region getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    // #endregion

}
