package com.br.estudo.exercicio;

import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        String product1, product2;
        int age, code;
        char gender;
        double price1, price2, measure;

        product1 = "Computer";
        product2 = "Office Desk";

        age = 30;
        code = 5290;
        gender = 'F';

        price1 = 2100.0;
        price2 = 650.50;
        measure = 53.234567;
        
        System.out.printf("%n");
        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);
        System.out.printf("%n");
        System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);
        System.out.printf("%n");
        System.out.printf("Measure with eight deciamal places: %f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal ponit %.3f %n", measure);
        System.out.printf("%n");
    }
}
