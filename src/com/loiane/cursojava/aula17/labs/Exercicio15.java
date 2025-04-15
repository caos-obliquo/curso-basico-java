package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        15 - A série de Fibonacci é formada pela sequência 0, 1, 2, 3, 8, 13, 21, 34, 55,... Faça um programa que gere
        a série até o n-ésimo termo.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da série Fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

//        1, 1, 2, 3, 5
//        primeiro = 1
//        segundo = 2
//        proximo = 3

        for (int i =  3; i <= n; i++) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}