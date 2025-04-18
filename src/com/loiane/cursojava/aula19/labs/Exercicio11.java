package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        11 - Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de
        de elementos armazenados neste vetor que são pares.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int quantidadePares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
//                quantidadePares++;
                quantidadePares += 1;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números pares: " + quantidadePares);
    }
}
