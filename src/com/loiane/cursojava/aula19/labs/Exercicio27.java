package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        /*
        27 - Criar um vetor A com elementos 10 inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as
        seguintes regras de formação:
        a) B[i] deverá receber 'a' quando A[i] for menor que 7;
        b) B[i] deverá receber 'b' quando A[i] for igual a 7;
        c) B[i] deverá receber 'c' quando A[i] for maior que 7 e menor que 10;
        d) B[i] deverá receber 'd' quando A[i] for igual a 10;
        e) B[i] deverá receber 'e' quando A[i] for maior que 10;
        Sugestão: char B[10];
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com um número para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
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
