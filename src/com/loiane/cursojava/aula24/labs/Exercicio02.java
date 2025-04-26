package com.loiane.cursojava.aula24.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        02 - Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
        */

        Livro livro = new Livro();

        livro.tituloLivro = "Assim Falou Zaratustra";
        livro.autor = "Friederick Nieztsche";
        livro.generoLiterario = "Filosofia";
        livro.numeroPaginas = 442;
        livro.anoLançamento = 1885;
    }
}
