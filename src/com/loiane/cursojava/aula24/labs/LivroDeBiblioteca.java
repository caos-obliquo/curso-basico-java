package com.loiane.cursojava.aula24.labs;

import java.time.LocalDate;

public class LivroDeBiblioteca {

    String tituloLivro;
    String autor;
    String generoLiterario;
    int numeroPaginas;
    int anoLançamento;

    boolean emprestado;
    LocalDate dataEntrega = LocalDate.now();
    String responsavelComOLivroAtualmente;

}
