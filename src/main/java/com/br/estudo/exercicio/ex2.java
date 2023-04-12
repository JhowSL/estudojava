package com.br.estudo.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        double cont = 50.0;

        if (min > 100) {
            cont = cont + (min - 100) * 2;
        }
        System.out.printf("Valor da conta = R$ %.2f", cont);
    }

}
