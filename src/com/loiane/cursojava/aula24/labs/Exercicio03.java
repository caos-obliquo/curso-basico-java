package com.loiane.cursojava.aula24.labs;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        03 - Usando o resultado do exercícios anterior como base, crie uma classe "LivroLivraria" que represente
        os dados básicos de um livro que está à venda em uma livro.
        */

        LivroLivraria livro = new LivroLivraria();

        livro.tituloLivro = "O Anticristo";
        livro.autor = "Friederick Nieztsche";
        livro.generoLiterario = "Filosofia";
        livro.numeroPaginas = 80;
        livro.anoLançamento = 1895;
        livro.preco = 18.31;

        System.out.println(livro.tituloLivro + " por " + livro.autor + " é um sucesso atemporal! xD");
    }
}
