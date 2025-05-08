package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        04 - Reescreva o exercício 06 da aula20 (Jogo da Velha). Desenvolva uma classe para representar o Jogo da Velha.
        Desenvolva uma classe para testar o Jogo.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Jogo da Velha - Jogador 1 = X, Jogador 2 = O");
        System.out.print("Quem começa? (X/O): ");
        char inicio = scan.next().toUpperCase().charAt(0);

        // Validação da entrada
        while (inicio != 'X' && inicio != 'O') {
            System.out.print("Entrada inválida! Digite X ou O: ");
            inicio = scan.next().toUpperCase().charAt(0);
        }

        JogoVelha jogo = new JogoVelha(inicio);

        System.out.println("\nPosições do tabuleiro correspondem ao teclado numérico:");
        System.out.println("-------------");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("-------------");
        System.out.println("\nEscolha uma posição de 1 a 9 para jogar:");

        while (!jogo.isJogoAcabou() && jogo.getJogadas() < 9) {
            jogo.exibirTabuleiro();

            System.out.print("Jogador '" + jogo.getJogadorAtual() + "' digite a posição (1-9): ");
            int posicao = scan.nextInt();

            if (jogo.fazerJogada(posicao)) {
                if (jogo.verificarVitoria()) {
                    jogo.finalizarJogo(true);
                } else if (jogo.getJogadas() == 9) {
                    jogo.finalizarJogo(false);
                } else {
                    jogo.alternarJogador();
                }
            }
        }

        scan.close();
        System.out.println("\nFim de jogo! Obrigado por jogar! :3");
    }
}