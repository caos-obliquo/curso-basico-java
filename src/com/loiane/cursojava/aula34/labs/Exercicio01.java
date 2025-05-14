package com.loiane.cursojava.aula34.labs;

public class Exercicio01 {

    static void imprimirValor() {
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {
        /*
        01 - Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe
        for instanciada. Crie methods para zerar, incrementar e retornar o valor do contador. Desenvolva um programa
        para testar essa classe.
         */

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();
    }
}
