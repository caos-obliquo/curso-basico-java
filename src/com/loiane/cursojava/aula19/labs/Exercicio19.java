package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
        19 - Ler duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas imprimidas em dois vetores
        "Nota1" e "Nota2" do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas
        armazenando o resultado em um vetor "Result" do mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
        de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará "Aprovado", caso contrário, a
        situação do aluno será "Reprovado".
         */

        Scanner scan = new Scanner(System.in);

//        quando estamos lendo dados de array é interessante colocar em plural para uma boa prática
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {

            System.out.println("Entre com a nota 1 do aluno " + (i + 1) + ":");
            notas1[i] = scan.nextDouble();

            System.out.println("Entre com a nota 2 do aluno " + (i + 1) + ":");
            notas2[i] = scan.nextDouble();

            resultados[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.print("Notas 1 =" );
        for (int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println();


        System.out.print("Notas 2 =" );
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
        System.out.println();

        System.out.println("Resultados:");
        for (int i = 0; i < resultados.length; i++) {

            if (resultados[i] >= 7) {
                System.out.println(resultados[i] + " - Aprovado");
            } else {
                System.out.println(resultados[i] + " - Reprovado");
            }
        }
    }
}
