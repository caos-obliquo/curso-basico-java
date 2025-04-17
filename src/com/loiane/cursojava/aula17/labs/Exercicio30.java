package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        /*
        30 - Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
        mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor e final devem ser informados
        pelo usuário, conforme o exemplo abaixo:

        Montar a tabuada de 5:
        Começa por: 4
        Terminar em: 7

        Vou montar a tabuada de 5 começando em 4 e terminando em 7:
        5 * 4 = 20
        5 * 5 = 25
        5 * 6 = 30
        5 * 7 = 35

        Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número para gerar a tabuada: ");
        int numero = scan.nextInt();

        boolean invalido = true;
        int numeroFinal, numeroInicial;

        do {

            System.out.println("Entre com o início da tabuada: ");
            numeroInicial = scan.nextInt();

            System.out.println("Entre com o final da tabuada: ");
            numeroFinal = scan.nextInt();

            if (numeroFinal > numeroInicial) {
                invalido = false;
            }

        }while (invalido);

        System.out.println("\n Tabuada do " + numero + ":");
        System.out.println("\n Começa por " + numeroInicial + ":");
        System.out.println("\n Termina em " + numero + ":");

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
