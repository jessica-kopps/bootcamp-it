package com.company;



import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {

        //Exercicio 1
        //PraticaExcecoes praticaExcecoes = new PraticaExcecoes(0, 300);
        //System.out.println(praticaExcecoes.tratamento());

        //Exercicio2
        ArrayList<Produto> productList = new ArrayList<>();

        productList.add(new NaoPereciveis("Feijão", 10.00, "Alimentos"));
        productList.add(new NaoPereciveis("Arroz", 5.00, "Alimentos"));
        productList.add(new Pereciveis("Yogurte", 11.00, 1));
        productList.add(new Pereciveis("Coxinha", 6.00, 2));
        productList.add(new Pereciveis("Torta de Limão", 4.00, 3));

        for (Produto produto : productList) {
            System.out.printf("Cinco produtos de %s ficam no o valor de R$%.2f.%n", produto.getNome(), produto.calcular(5));
        }



    }
}
