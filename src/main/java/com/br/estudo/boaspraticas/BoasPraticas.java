package com.br.estudo.boaspraticas;

import java.util.Locale;
import java.util.Scanner;

public class BoasPraticas {

    public static void main(String[] args) {
        BoasPraticas boasPraticas = new BoasPraticas();
        boasPraticas.checklist();
        System.out.println("\n");
        boasPraticas.split();
        System.out.println("\n");
        boasPraticas.comentarios();

    }

    public void checklist() {
        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

    }

    public void split() {
        String s = "potato apple lemon orange";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

    }

    public void comentarios() {

        /*
         * Este programa calcula as raízes de uma equação do segundo grau Os valores dos
         * coeficientes devem ser digitados um por linha
         */

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            double a, b, c, delta;
            System.out.println("Digite os valores dos coeficientes:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            delta = b * b - 4 * a * c; // cálculo do valor de delta

            System.out.println(delta);
        }

    }

}