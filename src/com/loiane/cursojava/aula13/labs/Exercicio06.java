package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        /**
         * 6 - Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }
}
