package com.loiane.cursojava.aula42;

public class Teste {
    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();
        // Pessoa aluno = new Aluno();
        // Pessoa professor = new Professor();

        // Sem herança.
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.URL_BLOG);
        // Constantes.URL_BLOG = "asçihaslfukashlfuias";
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        // total = total = 1;
        System.out.println(TOTAL);
    }
}
