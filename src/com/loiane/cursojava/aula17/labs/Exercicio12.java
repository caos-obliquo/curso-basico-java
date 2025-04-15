package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        12 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada , capaz de gerar a tabuada de qualquer número
        inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme
        o exemplo abaixo:

        Tabuada de 5:
        5 * 1 = 5
        5 * 2 = 10
        ...
        5 * 10 = 50
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10: ");
        int numero = scan.nextInt();

//        validação do número
        if (numero < 1 || numero >= 10) {
            System.out.println("Número inválido. Digite um número de 1 a 10: ");
            return;
        }

        System.out.println("\n Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
