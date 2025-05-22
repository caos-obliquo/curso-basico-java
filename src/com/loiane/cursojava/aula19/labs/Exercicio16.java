package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*
        16 - Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
        a) a somar dos elementos armazenados neste vetor que são inferiores a 15;
        b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        c) a média dos elementos armazenados no vetor que são superiores a 15.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int igual15 = 0;
        int quantidadeMaior15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                quantidadeMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i ++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade números == 15: " + igual15);
        System.out.println("Soma números > 15: " + somaMaior15);
        System.out.println("Média de números < 15: " + somaMenor15/quantidadeMaior15);
    }
}
