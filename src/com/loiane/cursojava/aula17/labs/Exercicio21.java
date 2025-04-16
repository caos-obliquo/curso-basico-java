package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        /*
        21 - Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade  de alunos
        para cada turma. As turmas  não podem ter mais de 40 alunos.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número de turmas: ");
        int numeroTurmas = scan.nextInt();

        int numeroAlunos;
        int soma = 0;

        for (int i = 1; i <= numeroTurmas; i++) {
            boolean invalido = true;

            do {
                System.out.println("Entre como número de alunos da turma " + i + ":");
                numeroAlunos = scan.nextInt();

                if (numeroAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválidos. Digite novamente: ");
                }
            }while (invalido);

            soma += numeroAlunos;
        }

        double media = (double) soma / numeroTurmas;

        System.out.println("A média de alunos por turma é de: " + media);
    }
}
