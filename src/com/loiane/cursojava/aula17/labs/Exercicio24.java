package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
        24 - O Sr Manoel acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é
        um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de
        pães, de 1 até 50, a partir do preço do pão informado pelo usuário, conforme exemplo abaixo:
        Preço do pão: R$ 0 .18
        Panificadora Pão de Ontem - Tabela de preços
        1 - R$ 0.18
        2 - R$ 0.36
        ...
        50 - R$ 9.00
         */

//        Scanner scan = new Scanner(System.in);

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 0; i <= 50; i++) {
            System.out.println(i + " - R$ " + (0.18 * i));
        }
    }
}
