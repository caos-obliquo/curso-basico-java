package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /**
         * 15 - Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem
         * ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
         * escaleno. Dicas:
         * a) Três lados formam um triângulo quando a somar de quaisquer dois lados for maior que o terceiro;
         * b) Triângulo equilátero: três lados iguais;
         * c) Triângulo Isósceles: quaisquer dois lados iguais;
         * d) Triângulo escaleno: três lados diferentes;
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1: ");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2: ");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado3) ||
                ((lado2 + lado3) > lado1)){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo equilátero.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triângulo escaleno.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles.");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }
    }
}
