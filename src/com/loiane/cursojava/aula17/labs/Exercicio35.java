package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        /*
        35 - Faça um programa que mostre os n termos da Série a seguir:
        S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + N/M.

        Imprima no final a somar da série.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();

        double soma = 0;

        for (int i = 1, j = 1; i <= n; i++, j += 2) {

//            parte de baixo e de cima respectivamente
            System.out.println(i + "/" + j + " + ");

            soma += i/j;
        }

        System.out.println("\nSoma = " + soma);
    }
}