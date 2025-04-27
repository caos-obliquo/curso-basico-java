package com.loiane.cursojava.aula27.labs;

public class JogoVelha {

    char[][] jogoVelha;
    char jogadorAtual;
    int jogadas;
    boolean jogoAcabou;

    public JogoVelha() {
        jogoVelha = new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        jogadorAtual = 'X';
        jogadas = 0;
        jogoAcabou = false;
    }

    public void exibirTabuleiro() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    boolean fazerJogada(int posicao) {

        if (posicao < 1 || posicao > 9) {
            System.out.println("Posicão inválida! Escolha de 1 a 9.");
            return false;
        }

        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;

        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Posição já ocupada! Tente outra.");
            return false;
        }

        jogoVelha[linha][coluna] = jogadorAtual;
        jogadas++;
        return true;
    }

    boolean verificarVitoria() {

        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][0] == jogadorAtual &&
                    jogoVelha[i][1] == jogadorAtual &&
                    jogoVelha[i][2] == jogadorAtual) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (jogoVelha[0][j] == jogadorAtual &&
                    jogoVelha[1][j] == jogadorAtual &&
                    jogoVelha[2][j] == jogadorAtual) {
                return true;
            }
        }

        if ((jogoVelha[0][0] == jogadorAtual &&
                jogoVelha[1][1] == jogadorAtual &&
                jogoVelha[2][2] == jogadorAtual) ||
                (jogoVelha[0][2] == jogadorAtual &&
                        jogoVelha[1][1] == jogadorAtual &&
                        jogoVelha[2][0] == jogadorAtual)) {
            return true;
        }

        return false;
    }

    boolean isJogoAcabou() {

        return jogoAcabou;
    }

    void alternarJogador() {

        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    char getJogadorAtual() {

        return jogadorAtual;
    }

    void finalizarJogo(boolean vitoria) {

        jogoAcabou = true;
        exibirTabuleiro();
        if (vitoria) {
            System.out.println("Jogador " + jogadorAtual + " venceu!");
        } else {
            System.out.println("Empate! O jogo terminou sem vencedor.");
        }
    }
}

