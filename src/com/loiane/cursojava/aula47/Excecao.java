package com.loiane.cursojava.aula47;

public class Excecao {
    public static void main(String[] args) {
        // Não tratar erros fazem a execuçã do programa terminar.
        // Tratando os erros permitem que o programa execute uma determinada lógica caso o erro ocorra.
        // Também permite que o programa continue a execução.
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excessão ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");
    }
}
