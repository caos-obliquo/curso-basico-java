package com.loiane.cursojava.aula52;

public class DivisaoNaoExata extends Exception {
    // Não foi utilizado setters, pois os valores não devem mudar.


    private int numeros;
    private int denominadores;

    public DivisaoNaoExata(int numerador, int denominador) {
    }

    public int getNumeros() {
        return numeros;
    }

    public int getDenominadores() {
        return denominadores;
    }

    @Override
    public String toString() {
        return "Resutado de " + numeros + "/" + denominadores + " não é um inteiro!";
    }
}
