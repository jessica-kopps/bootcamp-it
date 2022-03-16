package com.company;

public class NaoPereciveis extends Produto {
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo){
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis " +
                "\nTipo: '" + tipo + '\''
                ;
    }

    public double calcular(int quantidadeDeProdutos) {
        double result = preco*quantidadeDeProdutos;
        return result;
    }
}
