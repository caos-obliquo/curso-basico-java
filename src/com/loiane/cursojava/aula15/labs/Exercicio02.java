package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        /**
         * 02 - Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
         */

        Scanner scan = new Scanner(System.in);

            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if (num >= 0) {
                System.out.println("O número informado é positivo.");
            } else {
                System.out.println("O número informado é negativo");

            }
        }
    }


