package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /**
         * 23 - O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
         *                    Até 5Kg               Acima de 5Kg
         * Filé Duplo         R$ 4,90 por Kg        R$ 5,80 por Kg
         * Alcatra            R$ 5,90 por Kg        R$ 6,80 por Kg
         * Picanha            R$ 6,90 por Kg        R$ 7,80 por Kg
         * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
         * porém não há limites para a quantidade de carne por cliente. Se a compra for feita no cartão Tabajara, o
         * cliente receberá ainda um desconto de 5% sobre a carne total. Escreva um programa que peça o tipo e a
         * quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra:
         * tipo e quantidade da carne; preço total; tipo de pagamento; valor do desconto e valor a pagar.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne: ");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (kg): ");
        double quantidade = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1){

            System.out.println(quantidade + "kg - Fié Duplo");

            if (quantidade < 5){
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }

        } else if (tipo == 2) {

            System.out.println(quantidade + "kg - Alcatra");

            if (quantidade < 5){
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }

        } else if (tipo == 3) {

            System.out.println(quantidade + "kg - Picanha");

            if (quantidade < 5){
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }

        double total = quantidade * precoKg;
        System.out.println(quantidade + "kg * " + precoKg + "= " + total);

        System.out.println("Compra no cartão? Digite '1' para sim: ");
        int cartao = scan.nextInt();

        if (cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar de: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}
