package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /**
         * 22 - Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         *                     Até 5Kg                    Acima de 5Kg
         * Morango             R$ 2,50 por Kg             R$ 2,20 por Kg
         * Maçã                R$ 1,80 por Kg             R$ 1,50 por Kg
         * Se o cliente comprar mais de 8kg em frutas ou o valor total da compra ultrapassará R$ 25,00, receberá um
         * algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva
         * o valor a ser pago pelo cliente.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morango:");
        double quantidadeMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maçã: ");
        double quantidadeMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if (quantidadeMorango <= 5){
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (quantidadeMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = quantidadeMorango * precoKgMorango;
        double precoTotalMaca = quantidadeMaca * precoKgMaca;

        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;

        if ((quantidadeMorango + quantidadeMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preço total = " + precoTotal);
    }
}
