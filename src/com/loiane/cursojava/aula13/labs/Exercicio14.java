package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        /**
         * 14 - Faça um programa que peça o tamanho de um arquivo para o download (em MB) e a velocidade de um link
         * de internet  (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em min).
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo:");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet:");
        double velocidadeInternet = scan.nextDouble();;

        double tempo = tamanhoArquivo / velocidadeInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
