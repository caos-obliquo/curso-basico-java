package com.loiane.cursojava.aula40;

public class Teste {
    public static void main(String[] args) {
        // Herança; através dela, utilizando o 'extends', permite que a classe (sub) tenha acesso a outras (super):
        // * reutiliza códigos.
        // Polimorfismo; permite que uma subclasse modifique outros métodos obtidos através da herança:
        // * personalizar métodos herdados, mantendo a mesma assinatura.

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("16th Street SW");
        aluno.setEndereco("17th Street SW");
        professor.setEndereco("18th Street SW");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
