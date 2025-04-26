package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        04 - Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente os dados
        básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.
         */

        LivroDeBiblioteca livro = new LivroDeBiblioteca()   ;

        livro.tituloLivro = "A Genealogia da Moral";
        livro.autor = "Friederick Nieztsche";
        livro.generoLiterario = "Filosofia";
        livro.numeroPaginas = 176;
        livro.anoLançamento = 1887;

        livro.emprestado = true;
        livro.dataEntrega = LocalDate.now();
        livro.responsavelComOLivroAtualmente = "Beto";
    }
}
