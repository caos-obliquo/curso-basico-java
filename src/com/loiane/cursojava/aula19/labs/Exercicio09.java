package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        09 - Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C , onde cada elemento de C
        é a divisão dos respectivos elementos em A e B, ou seja, C[i] = A[i] / floatB[i].
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor do vetor A da posição: " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {

            System.out.println("Entre com o valor do vetor B da posição: " + i + ":");
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] / (float) vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}

