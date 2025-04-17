package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        /*
        31 - Um funcionário de uma empresa recebe aumento salarial anualmente:
        Sabe-se que:
        Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
        a) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
        b) A partir de 1997, os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Faça
        um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo
        que o usuário digite o salário inicial do funcionário.
         */

        Scanner scan = new Scanner(System.in);

        double salario = 1000; //95

        double percentual = 1.5; //96

        salario += (salario / 100) * percentual; //97

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i <= 2015; i++) {

            percentual *= 2;

            salario += (salario / 100) * percentual;

            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");

        }
    }
}
