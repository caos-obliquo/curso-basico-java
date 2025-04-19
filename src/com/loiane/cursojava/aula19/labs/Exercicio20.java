package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /*
        20 - Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene
        em vetor A com 20 elementos as seguintes conversões:
        21 - A[i] = cotação do dólar * i, para todos i variando de 1 até 20.
         */

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println();
    }
}
