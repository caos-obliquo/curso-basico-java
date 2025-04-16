package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
        17 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex: 5!=5.4.3.2.1=120.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println(numero + "! = ");

        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.println(i + " * ");
        }

        System.out.println("Resultado: " + fatorial);
    }
}
