package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        2. Escreva  uma  classe  para  representar  um  Curso,  que  tem  nome  e  horário.   Cada  curso  tem  um
        Professor,  que  possui  nome,  departamento  e  email.   Cada  Curso  também  pode  ter  vários  alunos
        (tipo  Aluno).  Cada  Aluno  tem   nome,  matricula  e  4  notas.  Escreva  um  programa  realizarDivisoes  que  crie  um
        Curso   com  5  alunos,  e  que  peça  para  o  usuário  entrar  com  as  4  notas  de  cada   aluno.  Ao
        final,  imprima  a  média  de  cada  aluno,  se  o  mesmo  está  aprovado   (media  maior  ou  igual  a  7),  e
        qual  é  a  média  da  turma.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o horário do curso: ");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o nome do departamento do professor: ");
        String depProf = scan.nextLine();

        System.out.println("Entre com o e-mail do professor: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("---Alunos---");

        Aluno[] alunos = new Aluno[5];
        for (int i =0; i < 5; i++) {

            scan.nextLine();

            System.out.println("Entre com o nome do aluno: " + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matrícula do aluno: ");
            String matAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota: " + (j + 1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
