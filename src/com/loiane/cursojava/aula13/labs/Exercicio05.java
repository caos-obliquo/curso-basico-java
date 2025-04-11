package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        /**
         * 5 - Faça um programa que converta metros para centímetros.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros:");
        double metros = scan.nextDouble();

        //1m - 100cm
        double cm = metros * 100;

        System.out.println("m é igual a: " + cm + "cm");
    }
}
