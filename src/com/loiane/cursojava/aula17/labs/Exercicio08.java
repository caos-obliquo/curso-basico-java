package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        08 - Faça um programa que leia 5 números e informe a soma e a média dos números.
         */

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Entre com um total de 5 números: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Número " + i + ":");
            numero = scanner.nextInt();
            soma += numero; //soma = soma + numero
        }

        float media = (float) soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " +media);
    }
}
