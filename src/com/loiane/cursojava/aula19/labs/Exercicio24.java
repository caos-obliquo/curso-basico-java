package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
        24 - Números palíndromos são aqueles que escritos da direita para a esquerda tem o mesmo valor quando escritos
        da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um
        dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor é igual ao
        último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos elementos ou
        chegar a conclusão que o vetor não é um palíndromo.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

//        dividindo por 2, pois não há necessidade de continuar analisando até o final do número
//        para efetuar a verificação de palíndromo, basta rodar até a metade do número
        boolean ePalindromo = true;
        for (int i = 0; i < vetorA.length / 2; i++) {

            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                ePalindromo = false;
                break;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        if (ePalindromo) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}