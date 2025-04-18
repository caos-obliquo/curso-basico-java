package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        01 - Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos"
        elementos do Vetor A, ou seja, B[i] = A[i].
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

//        pedindo ao usuário atribuir valores ao vetor
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

//        criando um for para setar o vetorB igual ao vetorA, porém podemos aproveitar o for criado anteriormente
//        for (int i = 0; i < vetorA.length; i++) {
//            vetorB[i] = vetorA[i];
//        }
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
