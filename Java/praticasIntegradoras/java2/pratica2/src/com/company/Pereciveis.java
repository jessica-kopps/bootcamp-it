package com.company;

public class Pereciveis extends Produto {

    int diasParaVencer;


    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis " +

                "\ndiasParaVencer:" + diasParaVencer
                ;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double result = preco*quantidadeDeProdutos;

        if(diasParaVencer == 1) return result / 4;
        if(diasParaVencer == 2) return result / 3;
        if(diasParaVencer == 3) return result / 2;
        return result;


    }
}
