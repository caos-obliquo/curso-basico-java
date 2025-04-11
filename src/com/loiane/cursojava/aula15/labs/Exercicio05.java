package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        /**
         * 05 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média
         * alcançada por aluno e representar:
         * a) A mensagem "Aprovado", se a média alcançada  for maior igual a sete;
         * b) A mensagem "Reprovado", se a média for menor que sete;
         * c) A mensagem "Aprovado com Distinção", se a nota for dez.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com Distinção.");
        } else if (media >= 7){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
