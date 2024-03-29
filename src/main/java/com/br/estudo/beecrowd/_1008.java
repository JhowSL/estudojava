package com.br.estudo.beecrowd;

import java.io.IOException;
import java.util.Scanner;

/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.*/
public class _1008 {
    // minha resolução
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int nF, hT;
        double vPh, salario;

        nF = leitor.nextInt();
        hT = leitor.nextInt();
        vPh = leitor.nextDouble();

        salario = hT * vPh;

        System.out.println("NUMBER = " + nF);
        System.out.printf("SALARY = U$ %.2f", salario);

    }

    // resolução aceita
    public static void main2(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int funcionarios = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
