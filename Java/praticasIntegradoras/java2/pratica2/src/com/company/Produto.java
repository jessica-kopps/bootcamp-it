package com.company;

public class Produto {
    String nome;
    double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "nome: '" + nome +
                "\npreco: " + preco
                ;
    }

    public double calcular(int quantidadeDeProdutos) {
        double result = preco*quantidadeDeProdutos;
        return (int) result;
    }
}
