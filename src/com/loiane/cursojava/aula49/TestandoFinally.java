package com.loiane.cursojava.aula49;

public class TestandoFinally {
    public static void main(String[] args) {
        // Abrir arquivo, realizar a leitura, ocorre o erro e fecha arquivo no finally.
        // Sempre será executado, independete da seção.
        // Ideal para liberar recursos (fechar arquivou, conexões e etc).
        // Irá executar mesmo que houver return no try/catch.
        // Não executa apenas se a JVM terminar (System.exit) ou erro fatal.

            int[] numeros = {4, 8, 16, 32, 64, 128};
            int[] denominadores = {2, 0, 4, 8, 0};

            for (int i = 0; i < numeros.length; i++) {
                try {
                    System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
                } catch (ArithmeticException e1) {
                    System.out.println("Erro ao dividir por zero");
                } catch (ArrayIndexOutOfBoundsException e2) {
                    System.out.println("Posição do array inválida");
                }
                finally {
                    System.out.println("Essa linha não será impressa se System.exit for chamado");
            }
        }
    }
}
