package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*
        16 - A série de Fibonacci é formada pela sequência 0, 1, 2, 3, 8, 13, 21, 34, 55,... Faça um programa que gere
        a série até que o valor seja maior que 500.
         */

//        Scanner scan = new Scanner(System.in);

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}
