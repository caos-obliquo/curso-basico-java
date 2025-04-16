package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        /*
        27 - O Departamento Estadual de Metereologia lhe contratou para desenvolver um programa que leia um conjunto
        indeterminado de temperaturas, e informe ao final a menor e a maior temperatura informada, bem como a média das
        temperaturas.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de temperaturas: ");
        int quantidadeTemperaturas = scan.nextInt();

        double temperatura;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= quantidadeTemperaturas; i++) {

            System.out.println("Entre com a temperatura " + i + ":");
            temperatura = scan.nextDouble();

            soma += temperatura;

            if (temperatura > maior) {
                maior = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }
        }

        System.out.println("Média: " + (soma / quantidadeTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
