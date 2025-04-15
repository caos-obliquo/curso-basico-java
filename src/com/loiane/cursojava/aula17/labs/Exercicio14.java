package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        14 - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantida-
        de de números pares e quantidade de números ímpares.
         */

        Scanner scan = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Entre com um total de 10 números!");
            System.out.println("Entre com um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares " + impares);
    }
}
