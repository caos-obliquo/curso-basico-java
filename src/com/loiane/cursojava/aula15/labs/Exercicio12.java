package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /**
         * 12 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de
         * Renda, que depende do salário bruto (conforme  tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde
         * a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
         * Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de
         * horas trabalhadas no mês.
         * a) Desconto do IR;
         * b) Salário Bruto até 900,00 (inclusive) - isento;
         * c) Salário Bruto até 1500,00 (inclusive) - isento;
         * d) Salário Bruto até 2500,00 (inclusive) - isento;
         * e) Salário Bruto acima de 2500,00 - desconto de 20%.
         * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é de 5 e a
         * quantidade da hora é 220:
         * Salário Bruto: (5 * 220) : R$ 1100,00
         * (-) IR (5%)              :  R$ 55,00
         * (-) INSS (10%)           : R$ 110,00
         * FGTS (11%)               : R$ 121,00
         * Total de descontos       : R$ 165,00
         * Salário Líquido          : R$ 935,00
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com as horas trabalhadas no mês: ");
        double quantidadeHora = scan.nextDouble();

        double salarioBruto = valorHora * quantidadeHora;

        int percentualIR = 0;
        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + "*" + quantidadeHora + "): " + salarioBruto + "R$");
        System.out.println("(-) IR (" + percentualIR + "% ):" + ir + "R$");
        System.out.println("(-) INSS (10%): " + inss + "R$");
        System.out.println("FGTS (11%): " + fgts + "R$");
        System.out.println("Total de descontos: " + totalDescontos + "R$");
        System.out.println("Salário Líquido: " + salarioLiquido + "R$");
    }
}
