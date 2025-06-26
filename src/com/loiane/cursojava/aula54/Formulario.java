package com.loiane.cursojava.aula54;

public class Formulario {
    // Demonstra um enum declarado dentro de uma classe.
    // * Útil quando o enum só é relevante no contexto da classe, como no exemplo

    // Enum que representa gêneros com valores associados.
    enum Genero {
        FEMINIMO('F'), MASCULINO('M'), OUTRO('O');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero; // Uso do enum aninhado.
}
