package com.loiane.cursojava.aula34.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        02 - Escreva uma classe Calculadora que tenha os seguintes methods: somar, subtrair, multiplicar, dividir
        (dois números), elevar a potência n. Desenvolva um programa para testar essa classe.
         */

        imprimirTela(Calculadora.somar(1, 2));

        imprimirTela(Calculadora.subtrair(2, 1));

        imprimirTela(Calculadora.multiplicar(2, 2));

        imprimirTela(Calculadora.dividir(4, 2));

        imprimirTela(Calculadora.potencia(2, 3));
    }

    static void imprimirTela(int num) {
        System.out.println(num);
    }
}
