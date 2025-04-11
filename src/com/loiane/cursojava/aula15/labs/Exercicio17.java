package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /**
         * 17 - Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este
         * ano é ou não bissexto.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano:");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("é bissexto.");
        } else {
            System.out.println("não é bissexto.");
        }
    }
}
