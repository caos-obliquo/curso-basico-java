package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*
        23 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos
        do vetor A são pares. Se pelo menos um elemento do vetor não for par o prcesso de repetição para percorrer os
        elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir esse
        propósito.
         */

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i< vetorA.length; i++){

            System.out.println("Entre com um número para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

//            ao invés de utilizar a flag como o enunciado pediu, utilizamos o break que foi passado na aula 18
            if (vetorA[i] % 2 != 0) {
                break;
            }
        }
    }
}
