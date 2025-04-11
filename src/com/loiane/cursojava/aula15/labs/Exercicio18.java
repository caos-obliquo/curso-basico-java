package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /**
         * 18 - Faça um programa que peça um número inteiro e determine se ele é par ou ímpar. Dica: utilize o
         * operador módulo (resto da divisão).
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("par.");
        } else {
            System.out.println("ímpar.");
        }
    }
}
