package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        /**
         * 10 - Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius:");
        double celsius = scan.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura " + celsius + "C é igual a " + farenheit + "F");
    }
}
