package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    /*
    04 - Supondo que a população de um país 'A' seja da ordem de 80000 habitantes com uma taxa anual de crescimento de
    3% e que a população de 'B' seja de 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que cal-
    cule e escreva o número de anos necessários para que a população do país 'A' ultrapasse ou iguale a populaçao do
    país 'B', mantidas as taxas de crescimento.
     */

        Scanner scanner = new Scanner(System.in);

        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaDeCrescimentoA = 0.03;
        double taxaDeCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaDeCrescimentoA);
            populacaoB += (int) (populacaoB * taxaDeCrescimentoB);
            anos++;
        }

        System.out.println(String.format("Anos necessários: %s, População A: %s, População B: %s", anos,
                populacaoA,populacaoB));
    }
}
