package com.loiane.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        // Classe Object.
        // É a classe pai de todas as outras classes do Java.

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        // 'aluno' é a referência de memória.
        System.out.println(aluno);

        String s1 = "slihaslkfuhasfu";
        String s2 = "slihaslkfuhasfu";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {9, 8, 6, 7};
        aluno2.setNotas(notas2);

        // Comparando referências de memória.
        // System.out.println(aluno == aluno2);

        System.out.println(aluno.equals(aluno2));
    }
}
