package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        /**
         * 11 - Faça um programa que peça dois números inteiros e um real. Calcule e mostre:
         * a) o produto do dobro do primeiro com metade do segundo.
         * b) a somar do triplo do primeiro com o terceiro.
         * c) o terceiro elevado ao cubo.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int numero1 = scan.nextInt();

        System.out.println("Entre com um número inteiro:");
        int numero2 = scan.nextInt();

        System.out.println("Entre com um número real:");
        double numero3 = scan.nextDouble();

        int resultado1 = (numero1 * 2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("Resultado a: " + resultado1);
        System.out.println("Resultado b: " + resultado2);
        System.out.println("Resultado c: " + resultado3);
    }
}
