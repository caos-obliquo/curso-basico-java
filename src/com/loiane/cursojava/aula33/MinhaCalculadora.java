package com.loiane.cursojava.aula33;

public class MinhaCalculadora {

    public int soma(int numero1, int numero2) {

        return numero1 + numero2;
    }

    public double soma(double numero1, double numero2) {

        return numero1 + numero2;
    }

    public int soma(int numero1, int numero2, int numero3) {

        return numero1 + numero2 + numero3;
    }

    public int soma(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }
}
