package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        01 - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
        continue pedindo até que o usuário informe um válor válido.
         */

        boolean notaValida = false;

        do {

            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com uma nota: ");

            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou " + nota);
            } else {
//                notaValida = false
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);
    }
}
