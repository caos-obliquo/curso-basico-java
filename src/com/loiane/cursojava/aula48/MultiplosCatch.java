package com.loiane.cursojava.aula48;

public class MultiplosCatch {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Posição do array inválida");
            }
        }
    }
}
