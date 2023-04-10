package com.br.estudo.entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char c;

        System.out.println("Digite um valor: ");
        x = sc.next();

        System.out.println("Digite um valor do tipo inteiro: ");
        y = sc.nextInt();

        System.out.println("Digite um valor do tipo double: ");
        z = sc.nextDouble();

        System.out.println("Digite um valor do tipo char: ");
        c = sc.next().charAt(0);

        System.out.printf("\nVocê digitou no valor: " + x);
        System.out.printf("\nVocê digitou no valor inteiro: " + y);
        System.out.printf("\nVocê digitou no valor double: %.2f", z);
        System.out.printf("\nVocê digitou no valor char: " + c);


        sc.close();
    }
}
