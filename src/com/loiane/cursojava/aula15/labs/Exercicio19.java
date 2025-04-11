package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /**
         * 19 - Faça um programa que leia 2 números e em seguida pergunte a usuário qual operação ele deseja realizar.
         * O resultado da operação deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo
         * e negativo.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com a operação matemática ('+', '-', '/' e '*'): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "/": resultado = num1 / num2; break;
            case "*": resultado = num1 * num2; break;
            default:
                System.out.println("Operação inválida.");
                valida = false;
        }

        if (valida){

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0){
                System.out.println("Resultado positivo.");
            } else {
                System.out.println("Resultado negativo.");
            }

            if (resultado % 2 == 0){
                    System.out.println("Resultado par.");
            } else {
                    System.out.println("Resultado ímpar.");
            }
        }
    }
}
