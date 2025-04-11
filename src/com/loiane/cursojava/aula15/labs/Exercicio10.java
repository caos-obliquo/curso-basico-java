package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /**
         * 10 - Faça um programa que pergunte em que turno você estuda. Peça para digitar M - Matutino ou V - Vespertino
         * ou N - Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!", "Boa Noite!" ou "Valor Inválido.", conforme
         * o caso.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda: ");
        String turno = scan.next();

        switch (turno){
            case "m":
            case "M":
                System.out.println("Bom Dia!"); break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!"); break;
            case "n":
            case "N":
                System.out.println("Boa Noite!"); break;
            default:
                System.out.println("Valor Inválido.");
        }
    }
}
