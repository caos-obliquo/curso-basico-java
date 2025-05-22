package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /*
        20 - Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de
        idade da turma varia entre 0, 25, 26, 60 e que maior que 60; e então, dizer se a turma é jovem, adulta, ou
        idosa, conforme a média calculada.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de idades: ");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;

//        loop para ler cada idade e acumular a somar
        for (int i = 0; i < idades; i++) {

            System.out.println("Entre com a idade da pessoa " + (i + 1));
            idade = scan.nextInt();

            soma += idade;
        }

        double media = (double) soma / idades;
        System.out.printf("Média de idade da turma: %.1f anos%n", media);

        if (media >= 0 && media <= 25) {
            System.out.println("JOVEM");
        } else if (media >= 26 && media <=60) {
            System.out.println("ADULTO");
        } else if (media > 60){
            System.out.println("IDOSA");
        }
    }
}
