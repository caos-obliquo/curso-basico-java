package com.loiane.cursojava.aula49;

public class FinallyPegadinha {
    public static void main(String[] args) {
        // Ao terminar a execução do programa dentro do try ou catch, o finally não é executado.

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0); // Comando que faz encerrar o programa.
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
                System.exit(0);

            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
                System.out.println();
            }
        }
    }
}


