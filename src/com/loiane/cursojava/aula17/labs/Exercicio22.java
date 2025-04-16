package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*
        22 - Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor
        médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDS:");
        int cds = scan.nextInt();

        double preco;
        double soma = 0;

        for (int i = 0; i <=cds; i++) {

            System.out.println("Entre com o valor para cada CD " + i + ":");
            preco = scan.nextDouble();

            soma += preco;
        }

        double media = soma / cds;

        System.out.println("A media gasta com cada CD: " + media);
    }
}
