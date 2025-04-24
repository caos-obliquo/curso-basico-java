package com.loiane.cursojava.aula24.labs;

public class LivroDeBiblioteca {
    public static void main(String[] args) {
        /*
        03 - Usando o resultado do exercícios anterior como base, crie uma classe "LivroDeBiblioteca" que represente
        os dados básicos de um livro que está à venda em uma livraria.
        */

        Livro livraria = new Livro();

        livraria.tituloLivro = "Assim Falou Zaratustra";
        livraria.autor = "Friederick Nieztsche";
        livraria.generoLiterario = "Filosofia";
        livraria.numeroPaginas = 442;
    }
}
