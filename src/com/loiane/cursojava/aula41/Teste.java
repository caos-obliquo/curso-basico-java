package com.loiane.cursojava.aula41;

public class Teste {
    public static void main(String[] args) {
        // Para as classes 'abstract' não podem ser instanciadas diretamente (não pode criar new Pessoa() se Pessoa for
        // abstrato). E a sua usabilidade é exclusiva para a herança.
        // Metódos 'abstract' não possuem corpo ({}). Deve ser sobrescrito (@Override) pelas subclasses e só existe em
        // classes abstratas.
        // Herança com abstract = subclasses devem implementar métodos abstratos e superclasse não pode ser instanciada.
        // Sua aplicabilidade é feita para garantir que as subclasses tenham determinados comportamentos.

        // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        // pessoa.setEndereco("16th Street SW");
        aluno.setEndereco("17th Street SW");
        professor.setEndereco("18th Street SW");

        // System.out.println(aluno.obterEtiquetaEndereco());
        // System.out.println(professor.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
