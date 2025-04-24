package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        05 - Modifique o programa anterior da maneira a guardar os compromissos do ano inteiro, organizados por mês,
        dia e hora (só 8 horas por dia).
         */

        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                for (int hora = 0; hora < 8; hora++) {
                    compromissos[mes][dia][hora] = "Nenhum compromisso.";
                }
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

                if (opcao == 1) {

                    System.out.print("Digite o mês (1-12): ");
                    int mes = scan.nextInt() - 1;
                    System.out.print("Digite o dia (1-31): ");
                    int dia = scan.nextInt() - 1;
                    System.out.print("Digite a hora (8-16): ");
                    int hora = scan.nextInt() - 8;

                    if (mes >= 0 && mes <= 12 && dia > 0 && dia <= 31 && hora >= 0 && hora < 24) {
                        scan.nextLine();
                        System.out.print("Digite o compromisso: ");
                        String compromisso = scan.nextLine();
                        compromissos[mes][dia][hora] = compromisso;
                        System.out.println("Compromisso agendado com sucesso!");
                    } else {
                        System.out.println("Data ou hora inválidas!");
                        scan.nextLine();
                        continue;
                    }

                } else if (opcao == 2) {

                    System.out.print("Digite o mês (1-12): ");
                    int mes = scan.nextInt() - 1;
                    System.out.print("Digite o dia (1-31): ");
                    int dia = scan.nextInt() - 1;
                    System.out.print("Digite a hora (8-16): ");
                    int hora = scan.nextInt() - 8;

                    if (mes >= 0 && mes < 12 && dia >= 0 && dia < 31 && hora >= 0 && hora < 8) {
                        System.out.println("Compromisso: " + compromissos[mes][dia][hora]);
                    } else {
                        System.out.println("Data ou hora inválidas!");
                    }
                    scan.nextLine();

                } else if (opcao == 0) {
                    System.out.println("Saindo do programa...");
                } else {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);
    }
}