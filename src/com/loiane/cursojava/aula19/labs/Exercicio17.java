package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
        17 - Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um
        programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
         */

        Scanner scan = new Scanner(System.in);

        int [] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa " + (i + 1) + ":");
            idades[i] = scan.nextInt();
        }

        int quantidade = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                quantidade++;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pessoas com idade > 35: " + quantidade);
    }
}
