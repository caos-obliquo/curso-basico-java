package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        09 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
         */

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " é um número ímpar");
            }
        }
    }
}