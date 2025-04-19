package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*
        22 - Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
        A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de
        números 0's e 1's existentes no vetor A.
         */

//        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int quantidade0 = 0;
        int quantidade1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                quantidade0++;
            } else {
                quantidade1++;
            }
        }

//        10 - 100%
//        quantidade - x
//        x = (quantidade * 100) / 10

        double porcentagem0 = (quantidade0 * 100) / vetorA.length;
        double porcentagem1 = (quantidade1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem 0 = " + porcentagem0);
        System.out.println("Porcentagem 1 = " + porcentagem1);
    }
}
