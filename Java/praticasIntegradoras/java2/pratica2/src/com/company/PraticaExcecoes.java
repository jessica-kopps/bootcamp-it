package com.company;


public class PraticaExcecoes {
    int a;
    int b;

    public PraticaExcecoes(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String tratamento () {
        try {
            int result = b / a;
        } catch (ArithmeticException exception) {
            System.out.println("Ocorreu um erro.");
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        }
        return "Programa Finalizado";
    }
}
