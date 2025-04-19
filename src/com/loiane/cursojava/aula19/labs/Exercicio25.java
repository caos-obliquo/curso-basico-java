package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /*
        25 - Criar um vetor A com elementos 10 inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as
        seguintes regras de formação:
        a) B[i] deverá receber 1 quando A[i] for par;
        b) B[i] deverá receber 0 quando A[i] for ímpar.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();

//            operador ternário. se for diferente de 0, recebe 1
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
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
    }
}
