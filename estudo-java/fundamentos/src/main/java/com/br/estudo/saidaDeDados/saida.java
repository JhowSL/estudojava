package com.br.estudo.saidaDeDados;

import java.util.Locale;

public class saida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.println(y);
        System.out.println("AAAAAAA");
        System.out.printf("%.4f%n", x);

        System.out.println("TEM" + x + "METROS");
        System.out.printf("TEM = %.2f METROS", x);

        String nome = "Jonathan";
        int idade = 20;
        double renda = 4000.00;

        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);
    }

}
