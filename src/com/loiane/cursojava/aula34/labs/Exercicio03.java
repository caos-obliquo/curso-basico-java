package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        03 - Escreva um method para calcular factorial de um número na classe Calculadora do exercício anterior.
         */

        Scanner scan = new Scanner(System.in);

        int num;

        do {

            System.out.println("Entre com um número positivo: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, entre novamente.");
            }

        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));
    }
}
