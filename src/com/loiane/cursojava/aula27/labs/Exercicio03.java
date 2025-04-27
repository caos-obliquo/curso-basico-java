package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        03 - Escreva uma class para representar um aluno. Adicione atributos relacionados às características de um
        aluno; como nome, matrícula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas
        dessas 3 disciplinas. Desenvolva um method para verificar se o aluno está aprovado (nota maior ou igual a 7) em
        uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao
        usuário e ao final informa o nome das disciplinas, mostra as notas e printa se ou aluno foi aprovado ou não.
         */

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a matrícula: ");
        aluno.matricula = scan.next();

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado.");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado.");

            }
        }
    }
}
