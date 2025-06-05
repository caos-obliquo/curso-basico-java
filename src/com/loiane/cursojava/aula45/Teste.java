package com.loiane.cursojava.aula45;

public class Teste {
    public static void main(String[] args) {
        /*
        // Upcasting (ímplicito)
        // Converter de subclasse para uma superclasse.
        // Sempre seguro pois uma suclasse é uma superclasse.

       // Downcasting (explícito)
       // Converter de superclasse para subclasse.
       // Precisa de verificação (istanceof).

        // Upcasting, exemplo sendo "Aluno pessoaAluno = aluno;".
        Aluno aluno = new Aluno();
        Aluno pessoaAluno = aluno;

        // Só funciona quando ela é estendida (extends).
        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        // Downcasting, exemplo com erro pois a classe Pessoa possui atributos diferentes da classe Aluno.
        Aluno aluno4 = (Aluno) aluno3;
         */

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Operador istanceof:
        // * Retorna true se o objeto é instância do tipo testado.
        // * Usado para verificar tipos antes de fazer downscasting.
        // * Previne ClassCastException.
        // * Também funciona com interfaces.
        if (pessoa instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");

        }if (aluno instanceof Aluno) {
            System.out.println("é do tipo Aluno");

        }if (professor instanceof Professor) {
            System.out.println("é do tipo Professor");
        }
    }
}
