package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        /*
        33 - Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma
        mensagem indicando se o respectivo elemento é um número primo ou não.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        String mensagem = "";
        boolean primo = true;

        for (int i = 0; i < vetorA.length; i++) {

            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                mensagem = " primo";
            } else {
                mensagem = " não é primo";
            }

            System.out.println(vetorA[i] + mensagem);
        }
    }
}
