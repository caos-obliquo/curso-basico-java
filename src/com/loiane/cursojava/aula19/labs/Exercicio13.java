package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        13 - Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a somar dos elementos
        armazenados neste vetor que são múltiplos de 5.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Somando apenas os múltiplos de 5: " + soma);
    }
}
