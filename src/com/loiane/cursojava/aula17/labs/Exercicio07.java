package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        07 - Faça um programa que leia 5 números e informe o maior número.
         */

        Scanner scan = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Informe um total de qualquer 5 números inteiros.");

        for (int i = 1; i <= 5;) {
            System.out.println("Entre com o número " +  i + ":");
            int numero;
            if (scan.hasNextInt()){
                numero = scan.nextInt();
                i++;
            } else {
                System.out.println("Entre com um número inteiro!");
                scan.next();
                continue;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior número digitado foi: " +maiorNumero);
    }
}