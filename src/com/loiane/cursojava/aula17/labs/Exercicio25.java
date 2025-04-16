package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /*
        25 - O Sr Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conve-
        niências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número
        desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador
        para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro
        que o cliente forneceu, para então calcular e mostrar o valor do tronco. Após esta operação, o programa deverá
        voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
        Lojas Tabajara
        Produto 1 - R$ 2.20
        Produto 2 - R$ 5.80
        Produto 3 - R$ 0
        Total: R$ 9.00
        Dinheiro: R$ 20.00
        Troco: R$ 11.00
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int quantidadeProdutos;
        double preco;
        double total;
        double valorPago;
        double troco;
        String output;

        do {
            System.out.println("Deseja informar uma nova compra? (S/N)");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "Lojas Tabajara\n";

                System.out.println("Digite a quantidade de produtos da compra: ");
                quantidadeProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= quantidadeProdutos; i++) {
                    System.out.println("Informe preço do produto " + i + ":");
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }

                output += "Total: R$ " + total;

                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = valorPago - total;

                output += "Troco: R$ " + troco;

                System.out.println(output);

            } else {
                sair = true;
            }
        } while (!sair);
    }
}