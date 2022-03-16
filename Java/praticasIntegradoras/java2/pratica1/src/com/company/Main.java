package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Jess", 27, "1");
        Pessoa pessoa3 = new Pessoa("Sophie", 27, "2", 65, 1.64);

        out.println(pessoa3.toString() + "\nIMC= " + infoPeso(pessoa3.calcularIMC()));

    }

    private static String infoPeso (int imc) {
        switch (imc) {
            case -1:
                return "Abaixo do peso";
            case 0:
                return "Peso ideal";
            case 1:
                return "Acima do peso";
            default:
                return "Deu ruim";
        }
    }
}
