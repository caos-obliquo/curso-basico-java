package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
    /*
    03 - Faça um programa que leia e valide as seguintes informações:
    a) Nome; maior que 3 carecteres.
    b) Idade; entre 0 e 150.
    c) Salário; maior que zero.
    d) Sexo; 'f' ou 'm'.
    e) Estado Civil; 's', 'c', 'v' e 'd'.
     */

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.println("Entre com um nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
                System.out.println("Nome válido!");
            } else {
                System.out.println("Nome inválido! O nome deve possuir mais de 3 caracteres. Tente novamente.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

        if (idade >= 0 && idade <= 150) {
            infoValida = true;
            System.out.println("Idade válida!");
        } else {
            System.out.println("Idade inválida! A idade deve estar entre 0 e 150.");
        }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com um salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
                System.out.println("Salário válido!");
            } else {
                System.out.println("Salário inválido! O salário deve ser maior que 0.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com um sexo: ");
            sexo =  scan.next().toLowerCase().charAt(0);

            if (sexo == 'm' || sexo == 'f') {
                infoValida = true;
                System.out.println("Sexo válido!");
            } else {
                System.out.println("Sexo inválido! Digite apenas a letra 'f' ou 'm': ");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com seu estado civil: ");
            estadoCivil = scan.next().toLowerCase().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                infoValida = true;
                System.out.println("Estado civil válido");
            } else {
                System.out.println("Estado civil inválido. Digite apenas 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);

        System.out.println(String.format("Nome: %s, Idade: %s, Salário %s, Sexo: %s, Estado Civil: %s", nome,
                idade, salario, sexo, estadoCivil));
    }
}