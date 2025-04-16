package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /*
        18 - Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo
        é aquele que é divisível somente por ele mesmo e por 1.
         */

        Scanner scan = new Scanner(System.in);

        boolean primo = true;

        System.out.println("Entre com um número inteiro: ");
        int numero = scan.nextInt();

//        seria mais funcional utilizar Math.sqrt();
//        ou mesmo i * i < numero;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo.");
                primo = false;
//                break
            }
        }

        if (primo) {
            System.out.println("É número primo!");
        }
    }
}
