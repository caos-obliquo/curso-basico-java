package com.loiane.cursojava.aula34;

public class MinhaCalculadora {
    public static int soma(int numero1, int numero2) {

        return numero1 + numero2;
    }

    public static double soma(double numero1, double numero2) {

        return numero1 + numero2;
    }

    public static int soma(int numero1, int numero2, int numero3) {

        return numero1 + numero2 + numero3;
    }

    public static int soma(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }
}
