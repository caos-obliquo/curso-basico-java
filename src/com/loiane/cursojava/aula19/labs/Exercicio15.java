package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        15 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o porcentual de elementos
        pares e ímpares, respectivamente, armazenados neste vetor.
         */

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int par = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                soma += vetorA[i];
                par++;
            }
        }

//        regra de 3 simples
        int impar = vetorA.length - par;

        double porcentagemPares = (par * 100) / vetorA.length;
        double porcentagemImpar = 100 - porcentagemPares;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem de pares: " + porcentagemPares);
        System.out.println("Porcentagem de Ímpares: " + porcentagemImpar);
    }
}
