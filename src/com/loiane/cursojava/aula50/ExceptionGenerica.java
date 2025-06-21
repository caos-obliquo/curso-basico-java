package com.loiane.cursojava.aula50;

public class ExceptionGenerica {
    public static void main(String[] args) {
        // Error: problemas graves que geralmente resultam na finalização do programa.
        // Exception: situações exepcionais que podem ser tratadas para continuar a execução do código.

        // No exemplo foi utilizado dois métodos comuns de tratamento:
        // 1 - getMessage(): mostra a mensagem padrão da exceção.
        // 2 - printStackTrace(): imprime a pilha de chamadas que levou ao erro.

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (Exception e) {
                // Captura Genérica:
                // Captura qualquer exceção que herde da superclasse Exception.
                // Útil quando queremos tratar diferentes tipos de erro da mesma forma.

                // Mensagem resumida do erro
                System.out.println("Mensagem do erro: " + e.getMessage());

                // Stack trace completo (útil para debug, mas recomendável evitar em produção).
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
