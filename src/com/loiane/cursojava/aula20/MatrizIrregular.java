package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        /*
        Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais
        movimentada da cidade onde você mora.
        A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho. Guarde essas
        informações em uma matriz de forma que cada pessoa entrevista ocupe somente o espaço necessário na memória
        para guardar os nomes dos filhos.
        Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos
        nomes de cada filho.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de pessoas que serão entrevistadas: ");
        int numeroEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {

            System.out.println("Entre com a quantidade de filhos: ");
            int quantidadeFilhos = scan.nextInt();

            nomesFilhos[i] = new String[quantidadeFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {

                System.out.println("Digite o nome do filho " + (j + 1));

                nomesFilhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
