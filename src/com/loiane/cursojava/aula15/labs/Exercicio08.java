package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /**
         * 08 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
         * sabendo que a decisão é sempre pelo mais barato.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro preço: ");
        double preco1 = scan.nextDouble();

        System.out.println("Entre com o segundo preço: ");
        double preco2 = scan.nextDouble();

        System.out.println("Entre com o terceiro preço: ");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre produto número um: " + preco1);
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Compre produto número dois: " + preco2);
        } else {
            System.out.println("Compre produto número três: " + preco3);
        }
    }
}
