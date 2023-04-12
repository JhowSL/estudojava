package com.br.estudo.beecrowd;

import java.io.IOException;
import java.util.Scanner;

// minha resolução
public class _1009 {
    // minha resolução
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nV;
        double sF, vR;

        nV = leitor.next();
        sF = leitor.nextDouble();
        vR = leitor.nextDouble();

        var com = (vR * 15) / 100;

        double total = (sF + com);

        System.out.printf("TOTAL = %.2f", total);

    }

    // resolução aceita
    public static void main2(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;
        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
