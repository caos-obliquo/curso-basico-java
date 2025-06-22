package com.loiane.cursojava.aula52;

public class UsandoMinhaException {
    public static void main(String[] args) {

        try {
            realizarDivisoes();
        } catch (DivisaoNaoExata e) {
            System.err.println("Erro crítico: " + e.getMessage());
        }
    }

    public static void realizarDivisoes() throws DivisaoNaoExata {

        int[] numeradores = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 3};

        for (int i = 0; i < numeradores.length; i++) {
            try {
                verificarDivisao(numeradores[i], denominadores[i]);
                System.out.println(numeradores[i] + "/" + denominadores[i] + " = " +
                        (numeradores[i] / denominadores[i]));
            } catch (ArithmeticException e) {
                System.err.println("Erro aritmético: " + e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Índice inválido: Denominador não existe para o numerador " +
                        numeradores[i]);
            }
            catch (DivisaoNaoExata e) {
                System.err.println("Erro de divisão não exata: " + e.getMessage());
            }
        }
    }

    public static void verificarDivisao(int numerador, int denominador) throws DivisaoNaoExata {
        if (numerador % 2 != 0) {
            throw new DivisaoNaoExata(numerador, denominador);
        }

        if (denominador == 0) {
            throw new ArithmeticException("Divisao por zero");
        }
    }

}
