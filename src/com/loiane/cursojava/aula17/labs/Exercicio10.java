package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        10 - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo
        compreendido por eles.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números inteiros: ");
        int numero1 = scan.nextInt();

        System.out.println("Entre com dois números inteiros: ");
        int numero2 = scan.nextInt();

        for (int i = numero1; i <=numero2; i++) {
            System.out.println(i);
        }
    }
}
