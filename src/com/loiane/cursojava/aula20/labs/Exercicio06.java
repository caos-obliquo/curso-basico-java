package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        06 - Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida
        de jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a
        posição onde deseja colocar a peça ('O' ou 'X'). O programa deve impedir jogadas inválidas e determinar
        automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o
        programa deve atualizar a situação do tabuleiro na tela.
         */

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        char jogadorAtual = 'X';
        boolean jogoAcabou = false;
        int jogadas = 0;

        System.out.println("Jogador nº 1 = X");
        System.out.println("Jogador nº 2 = O");
        System.out.println("Escolha uma posição de 1 a 9 para jogar\n");

        while (!jogoAcabou && jogadas < 9) {

            // imprimindo o tabuleiro
            System.out.println("-------------");
            for (int linha = 0; linha < 3; linha++) {
                System.out.print("| ");
                for (int coluna = 0; coluna < 3; coluna++) {
                    System.out.print(jogoDaVelha[linha][coluna] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            // obtendo a jogada do jogador atual
            System.out.print("Jogador '" + jogadorAtual + "' digite a posição (1-9): ");
            int posicao = scan.nextInt();

            // validando a posição
            if (posicao < 1 || posicao > 9) {
                System.out.println("Posição inválida, deve ser de (1-9)!");
                continue;
            }

            // convertendo as posições para coordenadas
            int linha = (posicao - 1) / 3;
            int coluna = (posicao - 1) % 3;

            // verifica se a posição já está sendo ocupada
            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
                continue;
            }

            // faz a jogada
            jogoDaVelha[linha][coluna] = jogadorAtual;
            jogadas++;

            // verificando se o jogador atual ganhou
            boolean vitoria = false;

            // verificando as linhas
            for (int i = 0; i < 3; i++) {
                if (jogoDaVelha[i][0] == jogadorAtual &&
                        jogoDaVelha[i][1] == jogadorAtual &&
                        jogoDaVelha[i][2] == jogadorAtual) {
                    vitoria = true;
                    break;
                }
            }

            // verificando as colunas
            if (!vitoria) {
                for (int j = 0; j < 3; j++) {
                    if (jogoDaVelha[0][j] == jogadorAtual &&
                            jogoDaVelha[1][j] == jogadorAtual &&
                            jogoDaVelha[2][j] == jogadorAtual) {
                        vitoria = true;
                        break;
                    }
                }
            }

            // verificando as diagonais
            if (!vitoria) {
                if ((jogoDaVelha[0][0] == jogadorAtual &&
                        jogoDaVelha[1][1] == jogadorAtual &&
                        jogoDaVelha[2][2] == jogadorAtual) ||
                        (jogoDaVelha[0][2] == jogadorAtual &&
                                jogoDaVelha[1][1] == jogadorAtual &&
                                jogoDaVelha[2][0] == jogadorAtual)) {
                    vitoria = true;
                }
            }

            // fim do programa, seja por vitória ou empate
            if (vitoria) {
                System.out.println("\nParabéns!!! Jogador '" + jogadorAtual + "' venceu!");
                jogoAcabou = true;
            } else if (jogadas == 9) {
                System.out.println("\nEmpate! Ninguém venceu.");
                jogoAcabou = true;
            }

            // alterna os jogadores
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';

            System.out.println("\nTabuleiro Final:");
            System.out.println("-------------");

            for (int l = 0; l < 3; l++) {
                System.out.print("| ");
                for (int c = 0; c < 3; c++) {
                    System.out.print(jogoDaVelha[l][c] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        System.out.println("\n Fim de jogo! Obrigado por jogar!!! :3");
    }
}

