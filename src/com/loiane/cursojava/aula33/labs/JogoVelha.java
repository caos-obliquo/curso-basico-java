package com.loiane.cursojava.aula33.labs;

public class JogoVelha {

    private char[][] jogoVelha;
    private char jogadorAtual;
    private int jogadas;
    private boolean jogoAcabou;

    // Construtor padrão
    public JogoVelha() {
        this.jogoVelha = new char[3][3];
        inicializarTabuleiro();
        this.jogadorAtual = 'X';
        this.jogadas = 0;
        this.jogoAcabou = false;
    }

    // Construtor sobrecarregado com escolha de jogador inicial
    public JogoVelha(char jogadorInicial) {
        this.jogoVelha = new char[3][3];
        inicializarTabuleiro();
        if (jogadorInicial == 'O') {
            this.jogadorAtual = 'O';
        } else {
            this.jogadorAtual = 'X';
        }
    }

    private void inicializarTabuleiro() {
        char[] valores = {'7', '8', '9', '4', '5', '6', '1', '2', '3'};
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = valores[index++];
            }
        }
    }

    public boolean fazerJogada(int posicao) {
        // Mapeamento das posições para o novo layout
        int[][] posicoes = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (posicoes[i][j] == posicao) {
                    return fazerJogada(i, j);
                }
            }
        }

        System.out.println("Posição inválida! Escolha de 1 a 9.");
        return false;
    }

    // Method sobrecarregado (por coordenadas)
    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }

        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Posição já ocupada! Tente outra.");
            return false;
        }

        jogoVelha[linha][coluna] = jogadorAtual;
        jogadas++;
        return true;
    }

    public void exibirTabuleiro () {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }


    public boolean verificarVitoria() {

        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][0] == jogadorAtual &&
                    jogoVelha[i][1] == jogadorAtual &&
                    jogoVelha[i][2] == jogadorAtual) {
                return true;
            }
        }
            // Verifica linhas
            for (int i = 0; i < 3; i++) {
                if (jogoVelha[i][0] == jogadorAtual &&
                        jogoVelha[i][1] == jogadorAtual &&
                        jogoVelha[i][2] == jogadorAtual) {
                    return true;
                }
            }

        // verifica colunas
        for (int j = 0; j < 3; j++) {
            if (jogoVelha[0][j] == jogadorAtual &&
                    jogoVelha[1][j] == jogadorAtual &&
                    jogoVelha[2][j] == jogadorAtual) {
                return true;
            }
        }

        // verifica diagonais
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

    public void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public void finalizarJogo(boolean vitoria) {
        jogoAcabou = true;
        exibirTabuleiro();
        if (vitoria) {
            System.out.println("Jogador " + jogadorAtual + " venceu!");
        } else {
            System.out.println("Empate! O jogo terminou sem vencedor.");
        }
    }

    // getter
    public char getJogadorAtual() {
        return jogadorAtual;
    }

    public int getJogadas() {
        return jogadas;
    }

    public boolean isJogoAcabou() {
        return jogoAcabou;
    }
}