package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        /*
        26 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex: %!5.4.3.2.1=120.
        A saída deve ser conforme o exemplo abaixo:
        Fatorial de: 5
        5! = 5 . 4 . 3 . 2 . 1 = 120
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Fatorial de " + numero + "");

        System.out.print(numero + "! = ");

        int fatorial = 1;
        for (int i = numero; i > 1; i--) {
            fatorial *= i;
            System.out.print(i + " * ");
        }

        System.out.print("1 = " + fatorial);
    }
}
