package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        /**
         * 21 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
         * Gasolina:
         * a) até 20 litros, desconto de 3% por litro;
         * b) acima de 20 litros, desconto de 5% por litro;
         * Álcool:
         * c) até 20 litros, desconto de 4% por litro;
         * d) acima de 20 litros, desconto de 6% por litro.
         * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte
         * forma: A - álcool, G - gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o
         * preço do litro da gasolina é de R$ 2,50 e o preço do litro do álcool é de R$ 1,90.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Entre com o tipo de combustível: ");
        String tipo = scan.next();

        double precoGasolina = 2.5;
        double precoAlcool = 1.9;
        int percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")){

            if (litros <= 20){
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            total = litros * precoAlcool;


        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20){
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }

            total = litros * precoGasolina;
        }

        totalDesconto = (total / 100) * percentualDesconto;

       double precoAPagar = total - totalDesconto;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}