package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    /*
    05 - Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento inicial.
    Valide a entrada e permita repetir a operação.
     */

        Scanner scanner = new Scanner(System.in);

        int populacaoA = 0;
        int populacaoB = 0;
        double taxaA = 0;
        double taxaB = 0;
        int anos = 0;
        boolean infoValida = false;

        do {
            System.out.println("Entre com a população do país 'A': ");

            if (scanner.hasNextInt()) {
                populacaoA = scanner.nextInt();
            } else {
                System.out.println("Entre com um caracter numérico!");
                scanner.next();
                continue;
            }

            if (populacaoA > 0) {
                infoValida = true;
            } else {
                System.out.println("Entre com um número maior que 0 para a população.");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Entre com a taxa da população do país 'A': ");

            if (scanner.hasNextDouble()) {
                taxaA = scanner.nextDouble();
            } else {
                System.out.println("Entre com um caracter numérico!");
                scanner.next();
                continue;
            }

            if (taxaA > 0) {
                infoValida = true;
            } else {
                System.out.println("Entre com um número maior que 0 para a taxa de população.");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Entre com a população 'B': ");

            if (scanner.hasNextInt()) {
                populacaoB = scanner.nextInt();
            } else {
                System.out.println("Entre com um caracter numérico!");
                scanner.next();
                continue;
            }

            if (populacaoB > 0) {
                infoValida = true;
            } else {
                System.out.println("Entre com um número maior que 0 para a população.");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Entre com a taxa de população do país 'B': ");

            if (scanner.hasNextDouble()) {
                taxaB = scanner.nextDouble();
            } else {
                System.out.println("Entre com um caracter numérico: ");
                scanner.next();
                continue;
            }
             if (taxaB > 0) {
                 infoValida = true;
             } else{
                 System.out.println("Entre com um número maior que 0 para a taxa de população.");
             }
        } while (!infoValida);

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + (int)((populacaoA / 100) * taxaA);
            populacaoB = populacaoB + (int)((populacaoB /100) * taxaB);
            anos++;
        }
        System.out.println(String.format("Anos necessários: %s, População 'A': %s, População 'B': %s", anos, populacaoA, populacaoB));
    }
}
