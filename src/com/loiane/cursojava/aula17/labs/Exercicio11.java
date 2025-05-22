package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        11 - Altere o programa anterior para mostrar no final a somar dos números.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números inteiros: ");
        int numero1 = scan.nextInt();

        System.out.println("Entre com dois números inteiros: ");
        int numero2 = scan.nextInt();

        int soma = 0;

        for (int i = numero1; i <= numero2; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
