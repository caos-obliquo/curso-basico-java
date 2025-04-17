package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        /*
        32 - O cardápio de uma lanchonete é o seguinte:
        Especificação       Código     Preço
        Cachorro quente     100        R$ 1,20
        Bauru simples       101        R$ 1,30
        Bauru com ovo       102        R$ 1,50
        Hambúrguer          103        R$ 1,20
        Cheeseburguer       104        R$ 1,30
        Refrigerante        105        R$ 1,00

        Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser
        pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o
        pedido deve ser encerrado.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("--- LANCHONETE ---");
        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro Quente - R$1,20");
        System.out.println("101 - Bauru Simples - R$1,30");
        System.out.println("102 - Bauru com Ovo - R$1,50");
        System.out.println("103 - Hambúrguer - R$1,20");
        System.out.println("104 - Cheeseburguer - R$1,30");
        System.out.println("105 - Refrigerante - R$1,00");
        System.out.println("\nDigite 0 para finalizar o pedido");
        System.out.println("----------------------");

        int codigo, quantidade;
        double totalPedido = 0;

        do {
            System.out.print("\nCódigo do item (0 para sair): ");
            codigo = scan.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Quantidade: ");
            quantidade = scan.nextInt();

            double valorItem = 0;
            String nomeItem = "";

            switch (codigo) {
                case 100:
                    valorItem = 1.20 * quantidade;
                    nomeItem = "Cachorro Quente";
                    break;
                case 101:
                    valorItem = 1.30 * quantidade;
                    nomeItem = "Bauru Simples";
                    break;
                case 102:
                    valorItem = 1.50 * quantidade;
                    nomeItem = "Bauru com Ovo";
                    break;
                case 103:
                    valorItem = 1.20 * quantidade;
                    nomeItem = "Hambúrguer";
                    break;
                case 104:
                    valorItem = 1.30 * quantidade;
                    nomeItem = "Cheeseburguer";
                    break;
                case 105:
                    valorItem = 1.00 * quantidade;
                    nomeItem = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            totalPedido += valorItem;
            System.out.printf("%d x %s: R$%.2f\n", quantidade, nomeItem, valorItem);
            System.out.printf("Total parcial: R$%.2f\n", totalPedido);

        } while (true);

        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.printf("TOTAL A PAGAR: R$%.2f\n", totalPedido);
        System.out.println("=======================");
    }
}