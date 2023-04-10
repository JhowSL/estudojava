package com.br.estudo.beecrowd;

import java.util.Scanner;
import java.io.IOException;

/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo. */
public class _1001 {
    // minha resolução
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, X;
        A = sc.nextInt();
        B = sc.nextInt();
        X = A + B;
        System.out.println("X = " + X);
        sc.close();
    }

    // resolução aceita
    public static void main2(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
    }
}
