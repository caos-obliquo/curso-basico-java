package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        04 - Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve
        conter 24 horas, onde para cada uma destas 24 horas podemos associar uma tarefa específica (compromisso
        agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando
        em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para
        obter o compromisso armazenado.
         */

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        for (int dia = 0; dia < 31; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                compromissos[dia][hora] = "Nenhum compromisso.";
            }
        }

        byte opcao = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromissos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scan.hasNextByte()) {
                opcao = scan.nextByte();

//            validação do dia do mês (1-31)
                if (opcao == 1) {

                    System.out.print("Digite o dia do mês: ");
                    int dia = scan.nextInt();
                    System.out.print("Digite a hora: ");
                    int hora = scan.nextInt();

                    if (dia > 0 && dia <= 31 && hora >= 0 && hora < 24) {
                        System.out.println("Digite o compromisso: ");
                        String compromisso = scan.nextLine();
                    }

                    if (dia > 0 && dia <= 31 && hora >= 0 && hora < 24) {
                        scan.nextLine();
                        System.out.print("Digite o compromisso: ");
                        String compromisso = scan.nextLine();
                        compromissos[dia][hora] = compromisso;
                        System.out.println("Compromisso agendado com sucesso!");
                    } else {
                        System.out.println("Dia ou hora inválidas!");
                    }

                } else if (opcao == 2) {

                    System.out.print("Digite o dia do mês: ");
                    int dia = scan.nextInt();
                    System.out.print("Digite a hora do compromisso: ");
                    int hora = scan.nextInt();

                    if (dia > 0 && dia <= 31 && hora >= 0 && hora < 24) {
                        System.out.println("Compromisso: " + compromissos[dia][hora]);
                    } else {
                        System.out.println("Dia ou hora inválidas!");
                    }

                } else if (opcao == 0) {
                    System.out.println("Saindo do programa...");
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);
    }
}