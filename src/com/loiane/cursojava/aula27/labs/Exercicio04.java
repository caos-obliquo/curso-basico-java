package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        04 - Reescreva o Exercicio06 da aula20 (Jogo da Velha). Desenvolva uma classe para representar o Jogo da Velha.
        Desenvolva uma classe para testar o jogo.
         */

        Scanner scan = new Scanner(System.in);

        JogoVelha jogo = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        System.out.println("Escolha uma posição de 1 a 9 para jogar\n");

        while (!jogo.isJogoAcabou() && jogo.jogadas < 9) {
            jogo.exibirTabuleiro();

            System.out.print("Jogador '" + jogo.getJogadorAtual() + "' digite a posição (1-9): ");
            int posicao = scan.nextInt();

            if (jogo.fazerJogada(posicao)) {
                if (jogo.verificarVitoria()) {
                    jogo.finalizarJogo(true);
                } else if (jogo.jogadas == 9) {
                    jogo.finalizarJogo(false);
                } else {
                    jogo.alternarJogador();
                }
            }
        }

        System.out.println("\n Fim de jogo! Obrigado por jogar! :3");
    }
}
