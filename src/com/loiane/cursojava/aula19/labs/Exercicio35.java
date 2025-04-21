package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        /*
        35 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a
        relação de todos os divisores do respectivo elemento.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com a posição de " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Analizando o número " + vetorA[i] + ":");

            for (int j = 1; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j + " é divisor");
                }
            }
            System.out.println();
        }
    }
}
