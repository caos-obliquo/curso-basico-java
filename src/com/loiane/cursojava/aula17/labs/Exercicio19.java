package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
        19 - Faça um programa que calcule e mostre a média artmética de N notas.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de Média Aritmética");
        System.out.println("--------------------------------");

        System.out.println("Quantos números você quer calcular a média?: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.println("Entre com a nota " + (i + 1) + ":");
            nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / notas;

        System.out.println("--------------------------------");
//        %.2f para mostrar a média com 2 casas decimais
        System.out.printf("A média aritmética é: %.2f%n", media);
    }
}
