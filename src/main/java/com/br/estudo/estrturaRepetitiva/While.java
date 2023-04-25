package com.br.estudo.estrturaRepetitiva;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Scanner leitor = new Scanner(System.in);

        // int x = leitor.nextInt();

        // int soma = 0;
        // while (x != 0) {
        // soma += x;
        // x = leitor.nextInt();
        // }

        int x, y;
        x = 0;
        while (x < 5) {
            y = x * 3;
            System.out.print(y);
            x = x + 1;
        }
        System.out.println("\nFim");
    }

}
