package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /**
         * 06 - Faça um programa que leia três números e mostre o maior deles.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Primeiro número é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("Segundo número é maior: " + num2);
        } else {
            System.out.println("Terceiro número é maior: " + num3);
        }
    }
}
